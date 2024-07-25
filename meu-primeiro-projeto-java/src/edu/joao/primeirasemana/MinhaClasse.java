package edu.joao.primeirasemana;

public class MinhaClasse {
    public static void main(String [] args){
        String nome = "João";
        String sobrenome = "Melo Lima";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);

        long cep = 51250370;
        System.out.println(formatarCep(cep));

        double mediaFinal = 5;
        System.out.println(aprovado(mediaFinal));
    }

    public static String nomeCompleto(String nome, String sobrenome){
        return "Resultado do Método: " + nome.concat(" ").concat(sobrenome);
    }

    public static String formatarCep(long cep){
        String strCep = Long.toString(cep);
        String pp = strCep.substring(0, 2).concat(".");
        String sp = strCep.substring(2, 5).concat("-");
        String tp = strCep.substring(5);
        return pp + sp + tp;
    }

    public static boolean aprovado(double mediaFinal){
        if(mediaFinal >= 6){
            return true;
        }
        return false;
    }
}
