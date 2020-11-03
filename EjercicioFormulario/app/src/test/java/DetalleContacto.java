import java.util.Date;

public class DetalleContacto {

    private String Nombre;
    private Date FechaNacimiento;
    private String Telefono;
    private String email;
    private String DescripcionContacto;

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcionContacto() {
        return DescripcionContacto;
    }

    public void setDescripcionContacto(String descripcionContacto) {
        DescripcionContacto = descripcionContacto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public DetalleContacto(String nombre, Date fechaNacimiento, String telefono, String email, String descripcionContacto) {
        Nombre = nombre;
        FechaNacimiento = fechaNacimiento;
        Telefono = telefono;
        this.email = email;
        DescripcionContacto = descripcionContacto;
    }
}
