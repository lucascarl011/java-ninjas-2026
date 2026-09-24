package iniciante.tipoDeDados;

import java.util.Locale;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        Dados não primitivos: String, Array, Class, enum
        São tipos de dados em que pode-se colocar metodos para fazer alterações na variavel sem que seja mudado seu escopo
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase vai deixar tudo em CAPSLOCK
        System.out.println(nomeUpperCase);
        System.out.println(nome); // Esse está normal

        String aldeia =  "Aldeia da Folha";
        String aldeiaToLowerCase = aldeia.toLowerCase();
        System.out.println(aldeiaToLowerCase); // ToLowerCase vai deixar tudo em caixa baixa
        System.out.println(aldeia);

    }
}
