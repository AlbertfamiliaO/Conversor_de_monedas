import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        System.out.println("\n***** Bienvenido/a al Conversor de Moneda *******\n"

                + "***Que tipo de conversión que deseas realizar.***\n");

        System.out.println("1.- Dólar => Peso Dominicano\n" +
                "2.- Peso Dominicano => Dólar\n"+
                "3.- Euro => Real Peso dominicano\n"+
                "4.- Peso Dominicano => Euro\n"+
                "5.- Dólar => Peso Colombiano\n"+
                "6.- Peso Colombiano => Dólar\n"+
                "7.- Convertir otra moneda => Dólar\n"+
                "8.- Salir\n");

        int opcion= 0;
        while (opcion != 8){

            System.out.println("Elija una Opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    convertirMoneda.convertir("USD","DOP",consulta,teclado);

                    break;
                case 2:
                    convertirMoneda.convertir("DOP","USD",consulta,teclado);
                    break; //
                case 3:
                    convertirMoneda.convertir("EUR","DOP",consulta,teclado);
                    break;
                case 4:
                    convertirMoneda.convertir("DOP","EUR",consulta,teclado);
                    break;
                case 5:
                    convertirMoneda.convertir("USD","COP",consulta,teclado);
                    break;
                case 6:
                    convertirMoneda.convertir("COP","USD",consulta,teclado);
                    break;
                case 7:
                    convertirMoneda.convertirOtraMoneda(consulta,teclado);
                    break;
                case 8:
                    System.out.println("Gracias por Usar el Conversor de Monedas...");
                    break;
                default:
                    System.out.println("Opción no valida, elija opción, hasta luego... ");
                    break;
            }
        }
    }
}
