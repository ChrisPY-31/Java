
import java.lang.reflect.Array;
import java.util.Scanner;

import static RegistrarVehiculos.RegistrarVehiculoMenu.*;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //UIMenuPostal();

        menuOp();
        //RST1984
    }

    public static void menuOp() {
        int opcion = 0;
        System.out.println("Que Accion deseas realizar");
        System.out.println("1) Registrar vehiculos");
        System.out.println("2) Pagar Tenencia");
        System.out.println("3) Salir del programa");
        System.out.print("Que operacion quieres realizar: ");
        opcion = Integer.valueOf(entrada.nextLine());
        switch (opcion) {
            case 1:
                IngresarPlaca();
                break;
            case 2:
                System.out.println("Hola");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }


}