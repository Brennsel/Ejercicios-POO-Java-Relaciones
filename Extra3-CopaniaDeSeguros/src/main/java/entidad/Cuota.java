package entidad;

import java.time.LocalDate;
import java.util.Date;

public class Cuota {

    private Integer numeroDeCuota;
    private Float montoTotalDeCuota;
    private Boolean estaPagada;
    private FormaDePago formaPago;
    private LocalDate fechaDeVencimiento;

    public Cuota(Integer numeroDeCuota, Float montoTotalDeCuota, Boolean estaPagada, FormaDePago formaPago, LocalDate fechaDeVencimiento) {
        this.numeroDeCuota = numeroDeCuota;
        this.montoTotalDeCuota = montoTotalDeCuota;
        this.estaPagada = estaPagada;
        this.formaPago = formaPago;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Integer getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(Integer numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public Float getMontoTotalDeCuota() {
        return montoTotalDeCuota;
    }

    public void setMontoTotalDeCuota(Float montoTotalDeCuota) {
        this.montoTotalDeCuota = montoTotalDeCuota;
    }

    public Boolean getEstaPagada() {
        return estaPagada;
    }

    public void setEstaPagada(Boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    public FormaDePago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaDePago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    @Override
    public String toString() {
        return "Cuota{" +
                "numeroDeCuota=" + numeroDeCuota +
                ", montoTotalDeCuota=" + montoTotalDeCuota +
                ", estaPagada=" + estaPagada +
                ", formaPago=" + formaPago +
                ", fechaDeVencimiento=" + fechaDeVencimiento +
                '}';
    }
}
