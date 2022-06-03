import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibroCuentas cuentas = new LibroCuentas();

        boolean salida = false;

        System.out.println("\n\t==================");
        System.out.println("\tBienvenido usuario");
        System.out.println("\t==================\n");

        while (!salida) {

            System.out.println("\n\t=======================");
            System.out.println("\tUsuario que desea hacer");
            System.out.println("\t=======================\n");

            System.out.println("1. Añadir un gasto");
            System.out.println("2. Ver lista de gastos");
            System.out.println("3. Calcular gasto total");
            System.out.println("4. Salir");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    cuentas.añadirGasto();
                    break;

                case "2":
                    cuentas.verGastos();
                    break;

                case "3":
                    cuentas.calcularGastos();
                    break;

                case "4":
                    salida = true;
                    break;
            }
        }
    }
}
