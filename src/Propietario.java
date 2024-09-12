import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private int codigoPostal;
    private String asentamiento;
    private String calle;
    private int telefono;
    private String rfc;

    Propietario(){

    }

    public Propietario(String nombre, String rfc, int telefono, String calle, String asentamiento, int codigoPostal) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.calle = calle;
        this.asentamiento = asentamiento;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAsentamiento() {
        return asentamiento;
    }

    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
/*

    public static class addCarUser {
        ArrayList<Propietario> myPropietario = new ArrayList<>();
        Propietario propietario;

        public void addPropietario(){
            myPropietario.add(propietario);
        }

    }
 * */
}
