import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        System.out.println(" Bienvenidos al conversor de monedas ");

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Dólar a Peso Argentino ");
            System.out.println("2. Peso Argentino a Dólar ");
            System.out.println("3. Dolar  a Real Brasilero ");
            System.out.println("4. Real Brasilero  a Dólar ");
            System.out.println("5. Dólar  a Peso Colombiano ");
            System.out.println("6. Peso Colombiano  a Dólar ");

            System.out.println("7. Salir");

            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción 1.");
                    System.out.println("Ingrese la cantidad a convertir :");
                    double cantidad1 = scanner.nextDouble();
                    double resultado1 = ApiMonedas.obtenerTasaCambio("USD", "ARS");
                    if (resultado1 != -1)
                        System.out.println(" El resultado es :" + cantidad1 + " dólar equivale a " + cantidad1*resultado1 + " pesos argentinos.");
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2.");
                    System.out.println("Ingrese la cantidad a convertir :");
                    double cantidad2 = scanner.nextDouble();
                    double resultado2 = ApiMonedas.obtenerTasaCambio("ARS", "USD");
                    if (resultado2 != -1)
                        System.out.println(cantidad2 + " ARS equivalen a " + cantidad2*resultado2 + " USD.");
                    break;

                case 3:
                    System.out.println("Has elegido la opción 3.");
                    System.out.println("Ingrese la cantidad a convertir :");
                    double cantidad3 = scanner.nextDouble();
                    double resultado3 = ApiMonedas.obtenerTasaCambio("USD", "BRL");
                    if (resultado3 != -1)
                        System.out.println(cantidad3 + " USD equivalen a " + cantidad3*resultado3 + " BRL.");
                    break;

                case 4:
                    System.out.println("Has elegido la opción 4.");
                    System.out.println("Ingrese la cantidad a convertir :");
                    double cantidad4 = scanner.nextDouble();
                    double resultado4 = ApiMonedas.obtenerTasaCambio("BRL", "USD");
                    if (resultado4 != -1)
                        System.out.println(cantidad4 + " BRL equivalen a " + cantidad4*resultado4 + " USD.");
                    break;

                case 5:
                    System.out.println("Has elegido la opción 5.");
                    System.out.println("Ingrese la cantidad a convertir :");
                    double cantidad5 = scanner.nextDouble();
                    double resultado5 = ApiMonedas.obtenerTasaCambio("USD", "COP");
                    if (resultado5 != -1)
                        System.out.println(cantidad5 + " USD equivalen a " + cantidad5*resultado5 + " COP.");
                    break;

                case 6:
                    System.out.println("Has elegido la opción 6.");
                    System.out.println("Ingrese la cantidad a convertir :");
                    double cantidad6 = scanner.nextDouble();
                    double resultado6 = ApiMonedas.obtenerTasaCambio("COP", "USD");
                    if (resultado6 != -1)
                        System.out.println(cantidad6 + " COP equivalen a " + cantidad6*resultado6 + " USD.");
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
            System.out.println(); // Espacio en blanco para mejor legibilidad
        }
        while (opcion != 7);

        scanner.close();
    }
}








