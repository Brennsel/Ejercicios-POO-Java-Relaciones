package entidad;

public class Cliente {

    private String nombreCompleto;
    private Long documento;
    private String mail;
    private Long telefono;

    public Cliente(String nombreCompleto, Long documento, String mail, Long telefono) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", documento=" + documento +
                ", mail='" + mail + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
