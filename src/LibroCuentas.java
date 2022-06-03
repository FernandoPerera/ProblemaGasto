import list.GenericStack;

public class LibroCuentas {

    private GenericStack<Gasto> libroCuentas = new GenericStack<>();

    Gasto gasto = new Gasto();

    public void añadirGasto() {

        libroCuentas.push(gasto.generarGasto());
    }

    public void verGastos() {
        for (int i = libroCuentas.size() - 1; i >= 0; i--) {
            System.out.println("\t--  " + libroCuentas.get(i));
        }
    }

    public void calcularGastos() {

        float resultado = 0;

        for (int i = libroCuentas.size() - 1; i >= 0; i--) {
            gasto = libroCuentas.get(i);

            resultado += gasto.getImporte();
        }

        System.out.println("El importe total es " + resultado);
    }
}
