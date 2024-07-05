import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        ConsultarMoneda consulta = new ConsultarMoneda();

        String menu = """
                \n****************************************************************
                Saludos! Bienvenid@ al conversor de monedas By-Jhase
                
                Selecciona la conversion que deseas realizar.
                
                1)Dolar               =>>          Peso Argentino
                2)Peso Argentino      =>>          Dolar
                3)Dolar               =>>          Real Brasileño
                4)Real Brasileño      =>>          Dolar
                5)Dolar               =>>          Peso Colombiano
                6)Peso Colombiano     =>>          Dolar
                7)Convertir otro tipo de moneda
                8)Salir
                
                Elija una opcion Valida:
                *****************************************************************
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 8){
            System.out.println(menu);
            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                teclado.nextLine(); // Consumir la nueva línea pendiente

                switch (opcion) {
                    case 1:
                        ConvertirMoneda.conversor("USD", "ARS", consulta, teclado);
                        break;
                    case 2:
                        ConvertirMoneda.conversor("ARS", "USD", consulta, teclado);
                        break;
                    case 3:
                        ConvertirMoneda.conversor("USD", "BRL", consulta, teclado);
                        break;
                    case 4:
                        ConvertirMoneda.conversor("BRL", "USD", consulta, teclado);
                        break;
                    case 5:
                        ConvertirMoneda.conversor("USD", "COP", consulta, teclado);
                        break;
                    case 6:
                        ConvertirMoneda.conversor("COP", "USD", consulta, teclado);
                        break;
                    case 7:
                        ConvertirMoneda.conversorOtraMoneda(consulta, teclado);
                        break;
                    case 8:
                        System.out.println("\nGracias por utilizar nuestro servico...\n");
                        break;
                    default:
                        System.out.println("\nOpcion incorrecta\n");
                }
            } else {
                System.out.println("\nEntrada inválida. Por favor, ingrese un número válido.\n");
                teclado.nextLine(); // Consumir la entrada no válida
            }
        }
    }
}