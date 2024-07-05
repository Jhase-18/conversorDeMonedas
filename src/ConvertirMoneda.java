import java.util.Scanner;

public class ConvertirMoneda {

    public static void conversor(String monedaPrincipal, String monedaConvertir, ConsultarMoneda consulta,
                                 Scanner teclado) {
        double cantidad;
        double conversion;

        Monedas monedas = consulta.buscarMoneda(monedaPrincipal, monedaConvertir);
        System.out.println("La tasa de conversion para hoy es:\n1 " + monedaPrincipal + " es igual a " + monedas.conversion_rate() + " " + monedaConvertir);
        System.out.println("Ingrese la cantidad de " + monedaPrincipal + " a convertir");

        // Manejar la entrada vacía
        String input = teclado.nextLine();
        if (input.isEmpty()) {
            System.out.println("La entrada no puede estar vacía. Por favor, ingrese una cantidad válida.");
            return;
        }

        try {
            cantidad = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            return;
        }

        conversion = cantidad * monedas.conversion_rate();
        System.out.println("La cantidad de " + cantidad + " " + monedaPrincipal + " es igual a " + conversion + " " + monedas.target_code());
    }

    public static void conversorOtraMoneda(ConsultarMoneda consulta, Scanner teclado) {
        System.out.println("\nEn el siguiente link podra ver los codigos disponibles para conversion:\n");
        System.out.println("https://www.exchangerate-api.com/docs/supported-currencies\n");
        System.out.println("Ingrese el codigo de la moneda a convertir:");
        String monedaPrincipal = teclado.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda en la que desea convertir la anterior:");
        String monedaConvertir = teclado.nextLine().toUpperCase();
        conversor(monedaPrincipal, monedaConvertir, consulta, teclado);
    }
}

