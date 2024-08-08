public class Carro extends Veiculo{
    public Carro(String nome, String placa){
        super(nome, placa);
    }

    @Override
    public void acelerar(){
        if(ligado){
            System.out.println("Carro acelerando!");
            return;
        }
        System.out.println("Primeiro, você deve ligar o carro!");
    }

    @Override
    public void freiar(){
        System.out.println("Carro freiando!");
    }
}
