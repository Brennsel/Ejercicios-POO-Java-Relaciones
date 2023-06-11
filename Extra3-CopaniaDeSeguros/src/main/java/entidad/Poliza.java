package entidad;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Poliza {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer numeroDePoliza;
    private final LocalDate fechaDeInicio;
    private final LocalDate fechaDeFinalizacion;
    private List<Cuota> cuotas;
    private Integer cantDeCuotas;
    private FormaDePago formapago;
    private Float montoTotalAsegurado;
    private TipoDeCobertura tipoCobertura;
    private Boolean incluyeGranizo;
    private Float montoMaximoGranizo;


    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer numeroDePoliza, LocalDate fechaDeInicio, LocalDate fechaDeFinalizacion, FormaDePago formapago, Float montoTotalAsegurado, TipoDeCobertura tipoCobertura, Boolean incluyeGranizo, Float montoMaximoGranizo) {
        cuotas = new ArrayList<>();
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroDePoliza = numeroDePoliza;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.formapago = formapago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.tipoCobertura = tipoCobertura;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(Integer numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public LocalDate getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public FormaDePago getFormapago() {
        return formapago;
    }

    public void setFormapago(FormaDePago formapago) {
        this.formapago = formapago;
    }

    public Float getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Float montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public TipoDeCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoDeCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(Boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Float getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Float montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    @Override
    public String toString() {
        return "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", numeroDePoliza=" + numeroDePoliza +
                ", fechaDeInicio=" + fechaDeInicio +
                ", fechaDeFinalizacion=" + fechaDeFinalizacion +
                ", cuotas=" + cuotas +
                ", cantDeCuotas=" + cantDeCuotas +
                ", formapago=" + formapago +
                ", montoTotalAsegurado=" + montoTotalAsegurado +
                ", tipoCobertura=" + tipoCobertura +
                ", incluyeGranizo=" + incluyeGranizo +
                ", montoMaximoGranizo=" + montoMaximoGranizo +
                '}';
    }

    public void contarCantDeCuotas() {
        Integer diffAnios = Period.between(fechaDeInicio, fechaDeFinalizacion).getYears();
        Integer diffMeses = Period.between(fechaDeInicio, fechaDeFinalizacion).getMonths();

        if (diffAnios > 0) {
            this.cantDeCuotas = diffMeses + (diffAnios * 12);
        } else {
            this.cantDeCuotas = this.cantDeCuotas + 1;
        }
    }

    public void crearCuotas() {

        for (int i = 0; i < cantDeCuotas; i++) {

            cuotas.add(new Cuota((i + 1), 35000.0F, false, formapago, fechaDeInicio.plusDays((30L * (i + 1)))));
        }
    }

    public void mostrarCuotas() {
        System.out.println(cuotas.toString());
    }

    public Float sumarCuotasVencidad() {

        Float montoAdeudado = 0F;

        for (Cuota cuotaActual : cuotas) {
            if (cuotaActual.getFechaDeVencimiento().isBefore(LocalDate.now())) {
                if (!cuotaActual.getEstaPagada()) {
                    montoAdeudado += cuotaActual.getMontoTotalDeCuota();
                }
            }
        }

        return montoAdeudado;
    }

    public void pagarCuota(Integer numeroDeCuota) {

        for (Cuota cuotaActual : cuotas) {
            if (cuotaActual.getNumeroDeCuota().equals(numeroDeCuota)) {
                cuotaActual.setEstaPagada(true);
            }
        }
    }

}
