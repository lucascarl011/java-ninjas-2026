package iniciante.condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        Switch Case serve para trabalhar com casos especificos
        Escolher entre os Ninjas
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Escolha um Ninja: ------");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sajura Haruno");

        int escolhaDoUsuario = sc.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
            break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
            break;
            case 3:
                System.out.println("Você escolheu a Sajura Haruno");
            break;
            default:
                System.out.println("Opção inválida!!!");
        }

        sc.close();
    }
}
