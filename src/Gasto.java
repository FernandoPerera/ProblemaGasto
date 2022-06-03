import java.util.Scanner;

public class Gasto {
    private String concepto;
    private float importe;

    public float getImporte() {
        return importe;
    }

    public Gasto() {
    }

    public Gasto(String concepto, float importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public Gasto generarGasto() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el concepto del gasto");
        concepto = scanner.nextLine();

        System.out.println("Ahora introduce el importe");
        importe = scanner.nextFloat();

        Gasto gasto = new Gasto(concepto, importe);

        return gasto;
    }

    @Override
    public String toString() {
        return "Gasto --> " +
                "concepto = '" + concepto +
                "  |  importe = '" + importe;
    }
}
