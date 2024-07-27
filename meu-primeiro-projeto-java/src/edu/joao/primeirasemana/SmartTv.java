package edu.joao.primeirasemana;

public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        System.out.println("Volume +5");
        volume += 5;
    }

    public void diminuirVolume(){
        System.out.println("Volume -5");
        volume -= 5;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}