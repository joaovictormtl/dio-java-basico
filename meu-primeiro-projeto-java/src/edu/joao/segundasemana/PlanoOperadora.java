package edu.joao.segundasemana;

public class PlanoOperadora {
    public static void main(String [] args){
        char plano = 'B';

        switch(plano){
            case 'T':
                System.out.println("5G de Youtube");
                break;
            case 'M':
                System.out.println("Whats e Instagram Grátis");
                break;
            case 'B':
                System.out.println("100 minutos de ligação");
                break;
        }
    }
}
