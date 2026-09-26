package iniciante.condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        Ternarios são maneiras de reduzir o codigo
        Ele funciona como if else, mas de forma mais resumida:
        variavel = (condicao) ? valorVerdadeiro : valorFalso;
         */

        short numeroDeMissoes = 7;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse Ninja é exeperiente, tem mais de 10 missões" : "Ninja inexperiente, tem menos de 10 missões";

        System.out.println(nivelDoNinja);
    }
}
