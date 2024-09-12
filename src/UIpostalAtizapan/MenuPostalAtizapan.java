package UIpostalAtizapan;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPostalAtizapan {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<CodigoPostal> myMunicipio = new ArrayList<>();
    static int codigoPostalAtizapan[] = {52500, 52503, 52504, 52506};

    public static void postalMain() {
        UIMenuPostal();
    }

    public static void UIMenuPostal() {
        int response = 0;
        int k = 0;
        System.out.println("**********+Codigos Postales Disponibles**********+");
        do {
            for(Integer codigoPostal: codigoPostalAtizapan) {
                k++;
                System.out.println(k + ".-" + codigoPostal);
            }
            System.out.println("Elige una opcion: ");
            response = entrada.nextInt();
            switch (response) {
                case 1:
                    postal52500();
                    break;
                case 2:
                    postal52503();
                    break;
                case 3:
                    postal52504();
                    break;
                case 4:
                    postal52506();
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (response != 0);
    }

    public static void postal52500() {
        int response = 0;
        do {
            System.out.println("1.-Libertad");
            System.out.println("2.-El palomar");
            System.out.println("3.-Santa cruz atizapan");
            System.out.println("4.-El tepiolo");
            System.out.println("0.-Return: ");
            System.out.print("Elige una opcion: ");
            response = entrada.nextInt();
            if (response == 1) {
                agregarMunicipio(52500, "Libertad");
            }
            if (response == 2) {
                agregarMunicipio(52500, "El palomar");
            }
            if (response == 3) {
                agregarMunicipio(52500, "Santa cruz atizapan");
            }
            if (response == 4) {
                agregarMunicipio(52500, "El tepiolo");
            }

        } while (response != 0);
    }

    public static void postal52503() {
        int response = 0;
        do {
            System.out.println("1.-El tepiolol");
            System.out.println("0.-Return: ");
            System.out.print("Elige una opcion: ");
            response = entrada.nextInt();
            if (response == 1) {
                agregarMunicipio(52503, "El tepiolol");
            }

        } while (response != 0);
    }

    public static void postal52504() {
        int response = 0;
        do {
            System.out.println("1.-Llano grande");
            System.out.println("2.-Tepozoco");
            System.out.println("0.-Return: ");
            System.out.print("Elige una opcion: ");
            response = entrada.nextInt();
            if (response == 1) {
                agregarMunicipio(52504, "LLano Grande");
            }
            if (response == 2) {
                agregarMunicipio(52504, "Tepozoco");
            }

        } while (response != 0);
    }

    public static void postal52506() {
        int response = 0;
        do {
            System.out.println("1.-La remolacha");
            System.out.println("0.-Return: ");
            System.out.print("Elige una opcion: ");
            response = entrada.nextInt();
            if (response == 1) {
                agregarMunicipio(52506, "La remolacha");
            }

        } while (response != 0);
    }

    public static void agregarMunicipio(int codigoPostal, String asentamiento) {
        CodigoPostal myCodigo = new CodigoPostal(codigoPostal, asentamiento);
        myMunicipio.add(myCodigo);
        for (CodigoPostal postalito : myMunicipio) {
            System.out.println();
            postalito.mostrarInformacion();
            System.out.println();
        }
    }

}
