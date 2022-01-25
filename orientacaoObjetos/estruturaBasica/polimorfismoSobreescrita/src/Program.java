public class Program {

    public static void main(String[] args) {

        Mae[] maes = new Mae[]{new Filha1(), new Filha2(), new Mae()};

        for (Mae mae: maes) {
            mae.metodo1();
        }

        System.out.println("");

        for (Mae mae: maes) {
            mae.metodo2();
        }

        System.out.println("");

        Filha2 filha2 = new Filha2();
        filha2.metodo2();

    }
}
