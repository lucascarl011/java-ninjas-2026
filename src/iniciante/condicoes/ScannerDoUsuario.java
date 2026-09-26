package iniciante.condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
       /*
    Scanner é um jeito de trazer o usuario para dentro da aplicação
     */

        Scanner sc = new Scanner(System.in);

        String nomedoNinja;
        int idadeNinja;

        System.out.println("Digite o nome do Ninja: ");
        nomedoNinja = sc.nextLine();

        System.out.println("Digite a idade do Ninja: ");
        idadeNinja = sc.nextInt();

        System.out.println("Nome do Ninja é: " + nomedoNinja);
        System.out.println("Idade do Ninja é: " + idadeNinja + " anos");

        if (idadeNinja >= 18) {
            System.out.println("Ninja: " + nomedoNinja + " é maior de idade");
        } else {
            System.out.println("Ninja: " + nomedoNinja + " é menor de idade");
        }

        sc.close();
    }
}
