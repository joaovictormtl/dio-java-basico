public class Moto extends Veiculo{
    public Moto(String nome, String placa){
        super(nome, placa);
    }

    @Override
    public void acelerar(){
        if(ligado){
            System.out.println("Moto acelerando!");
            return;
        }
        System.out.println("Primeiro, você deve ligar a moto!");
    }

    @Override
    public void freiar(){
        System.out.println("Moto freiando!");
    }
}
