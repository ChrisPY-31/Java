package UIpostalAtizapan;

public class CodigoPostal {
    private int codigoPostal;
    private String Asentamiento;
    public CodigoPostal(int codigoPostal, String Asentamiento) {
        this.codigoPostal = codigoPostal;
        this.Asentamiento = Asentamiento;
    }
    public void mostrarInformacion(){
        System.out.println("Codigo Postal: " + this.codigoPostal);
        System.out.println("Asesoramiento: " + this.Asentamiento);
    }
}
