public class Autodromo{
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari", "CFX887");
        System.out.println(carro.getPlaca());

        Moto moto = new Moto("Bugati", "RGB255");
        System.out.println(moto.getPlaca());

        carro.acelerar();
        carro.ligar();
        carro.acelerar();

        moto.acelerar();
    }
}