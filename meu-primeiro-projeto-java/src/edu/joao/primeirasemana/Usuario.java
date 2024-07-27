package edu.joao.primeirasemana;

public class Usuario {
    public static void main(String [] args){
        SmartTv smartTv = new SmartTv();

        // Estado inicial da smartTv
        System.out.println("TV Ligada? : "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? : "+smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? : "+smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume: "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume: "+smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal: "+smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal: "+smartTv.canal);

        smartTv.mudarCanal(6);
        System.out.println("Novo Status -> Canal: "+smartTv.canal);
    }
}
