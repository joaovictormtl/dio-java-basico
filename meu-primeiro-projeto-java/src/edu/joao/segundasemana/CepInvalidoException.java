package edu.joao.segundasemana;

public class CepInvalidoException extends Exception{
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "51.250-370";
    }
}
