public class Program {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Prata");
        carro1.setModelo("Stepway");
        carro1.setCapacidadeTanque(40);

        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Capacidade Tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Valor Tanque Cheio: " + carro1.totalValorTanque(6.1559));

        System.out.println("----------------------------------------");
        Carro carro2 = new Carro("Azul", "HB20", 45);

        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Capacidade Tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Valor Tanque Cheio: " + carro2.totalValorTanque(6.1559));
    }
}
