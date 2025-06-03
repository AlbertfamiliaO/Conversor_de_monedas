import java.util.Scanner;

public class convertirMoneda {
    public static void convertir(String _monedaBase, String _monedaObjetivo, ConsultarMoneda consulta, Scanner teclado){
        Scanner leer = new Scanner(System.in);
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMonedas(_monedaBase, _monedaObjetivo);
        System.out.println("La conversión para hoy de: ["+
                _monedaBase+"] equivale a "+ monedas.conversion_rate()+" ["+
                _monedaObjetivo+"]");
        System.out.println("Ingrese el valor que desea convertir "+_monedaBase);

        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida =  cantidad * monedas.conversion_rate();
        System.out.println("La conversion de:  "+cantidad+" ["+_monedaBase+"] Es igual a: "+
                cantidadConvertida+" ["+monedas.target_code()+"]\n");

        System.out.println("Desesa realizar otra conversion?");
    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner teclado){
        System.out.println("Ingrese el código de la moneda Base:");
        String monedaBase = teclado.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        String monedaObjetivo = teclado.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, teclado);
    }
}
