public abstract class Veiculo {
    String nome;
    String placa;
    boolean ligado;

    public Veiculo(String nome, String placa){
        this.nome = nome;
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar(){
        if(!ligado){
            this.ligado = true;
            System.out.println("Ligado!");
            return;
        }
        System.out.println("Já está ligado!");
    }

    public void desligar(){
        if(ligado){
            this.ligado = false;
            System.out.println("Desligado!");
            return;
        }
        System.out.println("Já está desligado!");
    }

    public abstract void acelerar();
    public abstract void freiar();
}
