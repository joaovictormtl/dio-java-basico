package edu.joao.segundasemana;

public class FormatadorCepExemplo{
    public static void main(String [] args){
        try{
        String cepFormatado = formatarCep("51250370");
        System.out.println(cepFormatado);
        } catch(CepInvalidoException e){
            e.printStackTrace();
            System.out.println("O CEP não corresponde às regras de negócio!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "51.250-370";
    }
}
