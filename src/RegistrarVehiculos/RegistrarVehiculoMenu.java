package RegistrarVehiculos;

import java.util.Scanner;

public class RegistrarVehiculoMenu {


    static final String MARCA[] = {"Mazda", "Susuki", "Hundai", "Renault"};

    static final String VERSIONMAZDA[] = {"i", "isport"};
    static final String VERSIONSUSUKI[] = {"GLTM", "GLXTM", "GLXCVT", "GLCVT"};
    static final String VERSIONHUNDAI[] = {"HB GL TM", "HB GL Mid TM", "HB GL Mid TA", "GL TM", "GL TM Mid"};
    static final String VERSIONRENAULT[] = {"ntense TM", "Iconic TM", "outsider TM", "Logan Intense TM", "Kangoo intense MY24"};

    static final String mazda[] = {"MAZDA1", "MAZDA2"};
    static final String susuki[] = {"IGNIS", "SWIFT", "GLSCVT"};
    static final String hundai[] = {"GRAND i10", "GRAND i10 SD ", "HB20 HB"};
    static final String renault[] = {"KWID", "LOGAN", "Logan Intens CVT"};

    static final int PRECIOMAZDA[] = {295900, 325900};
    static final int PRECIOSUSUKI[] = {254990, 319990, 339990, 284990, 299990};
    static final int PRECIOHUNDAI[] = {261300, 288500, 309200, 278100, 305600};
    static final int PRECIORENAULT[] = {235200, 259700, 273100, 319000, 338900};


    static Scanner entrada = new Scanner(System.in);


    public static void IngresarPlaca() {
        String placa;
        System.out.println();
        System.out.println("*********Registro Vehicular*********");
        System.out.println("Ingresa el numero de la placa: [LLLNNNN]");
        placa = entrada.nextLine();
        if (placa.length() == 7) {
            for (int i = 0; i < placa.length(); i++) {
                if (i >= 0 && i <= 2) {
                    if (placa.charAt(i) < 65 || placa.charAt(i) > 90) {
                        System.out.println("Los primeros 3 caracteres no son letras");
                    }
                } else if (i > 3 && i <= 6) {
                    if (placa.charAt(i) < 48 || placa.charAt(i) > 57) {
                        System.out.println("Los ultimos caracteres no son numeros");
                    }
                }

            }

            showMarcaVehiculo();
        } else {
            System.out.println("Estamos mal");
        }
    }

    public static void showMarcaVehiculo() {
        int opcion = 0;
        int k = 0;
        do {
            System.out.println("\n");
            System.out.println("Elige el coche: ");
            for (String miCarrito : MARCA) {
                k++;
                System.out.println(k + " ." + miCarrito);
            }
            System.out.println("0.-Return");
            k = 0;
            System.out.print("Elige el coche: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    showModeloVehiculo(mazda, MARCA[0]);
                    break;
                case 2:
                    showModeloVehiculo(susuki, MARCA[1]);

                    break;
                case 3:
                    showModeloVehiculo(hundai, MARCA[2]);

                    break;
                case 4:
                    showModeloVehiculo(renault, MARCA[3]);
                    break;
                default:

                    opcion = 0;
            }
        } while (opcion != 0);
    }

    public static void showModeloVehiculo(String modelo[], String marca) {

        System.out.println("Modelos de la marca: " + marca);
        int opcion = 0;
        int k = 0;
        int responseModelo = 0;
        do {
            for (String myModelo : modelo) {
                k++;
                System.out.println(k + ". " + myModelo);
            }
            System.out.println("0.-Return");

            System.out.println("Eliga la version del carro: " + marca);
            opcion = entrada.nextInt();

            if (opcion == 0) {
                showMarcaVehiculo();

            } else {

                do {

                    System.out.println("La version que eliegiste es: " + modelo[opcion - 1] + " es correct \n1.-Correct 2.-Cambiar");
                    responseModelo = entrada.nextInt();
                    if (responseModelo == 1) {
                        responseModelo = 2;
                        opcion = 0;
                    }
                    k = 0;

                } while (responseModelo != 2);
            }

        } while (opcion != 0);

        switch (marca) {
            case "Mazda":
                showVersionVehiculo(VERSIONMAZDA, marca);
                break;
            case "Susuki":
                showVersionVehiculo(VERSIONSUSUKI, marca);
                break;
            case "Hundai":
                showVersionVehiculo(VERSIONHUNDAI, marca);

                break;
            case "Renault":
                showVersionVehiculo(VERSIONRENAULT, marca);
                break;
            default:
                System.out.println("Estas mal chavo");
        }

    }

    public static void showVersionVehiculo(String version[], String marca) {
        int opcion = 0;
        int positionVehicular = 0;
        int k = 0;
        String versionAuto = "";
        int responseVersion = 0;
        System.out.println("En version");

        do {
            for (String myVersion : version) {
                k++;
                System.out.println(k + ". " + myVersion);
            }
            System.out.println("0.-Return: ");

            System.out.print("Elige La version del coche: ");
            opcion = entrada.nextInt();

            do {
                System.out.println("la version " + version[opcion - 1] + ": Es correct\n1.-Correct 2.-Cambiar");
                responseVersion = entrada.nextInt();

                if (responseVersion == 1) {
                    versionAuto = versionAuto + version[opcion - 1];
                    positionVehicular = opcion - 1;
                    responseVersion = 2;
                    opcion = 0;
                }
                k = 0;
            } while (responseVersion != 2);

        } while (opcion != 0);

        switch (marca) {
            case "Mazda":
                precioCar(PRECIOMAZDA, versionAuto ,marca , positionVehicular);
                break;
            case "Susuki":
                precioCar(PRECIOSUSUKI ,versionAuto ,marca , positionVehicular);

                break;
            case "Hundai":
                precioCar(PRECIOHUNDAI ,versionAuto ,marca , positionVehicular);


                break;
            case "Renault":
                precioCar(PRECIORENAULT,versionAuto ,marca , positionVehicular);

                break;
            default:
                System.out.println("Estas mal chavo");
        }


    }

    public static void precioCar(int precio[], String version , String marca , int positionVehicular) {
        int opcion = 0;

            System.out.println("El precio es: " + precio[positionVehicular]);
            System.out.println("Deseas cambiar de version: ");
            System.out.println("1 = si , 2 = no ");
            opcion = entrada.nextInt();

            if(opcion == 1) {
                System.out.println("Auto Agregado correctamente");
            }

    }
}

