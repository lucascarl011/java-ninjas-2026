package iniciante.tipoDeDados;

public class DesafioTipoDeDados {
    public static void main(String[] args) {
       /*
       Crie um programa que represente tres ninjas da vila da folha (Konoha) de "Naruto" e suas respectivas missões.
       Cada ninja tem um nome, uma idade e uma missão atribuida a ele, com o nome da missão, nivel de dificuldade e status de conclusão.
        */

        // Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 17;
        String missão1 = "Defender a Aldeia";
        double nivelDeficuldadeMissao1 = 5.6;
        String statusDaMissao1;

        if (idadeNinja1 < 18) {
            if (nivelDeficuldadeMissao1 >= 6) {
                statusDaMissao1 = "Concluida";
            }
            else {
                statusDaMissao1 = "Não Concluida";
            }
        } else {
            statusDaMissao1 = "Concluida";
        }

        // Ninja 2
        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 20;
        String missão2 = "Acabar com os inimigos";
        double nivelDeficuldadeMissao2 = 9.8;
        String statusDaMissao2;

        if (idadeNinja2 < 18) {
            if (nivelDeficuldadeMissao2 >= 6) {
                statusDaMissao2 = "Concluida";
            }
            else {
                statusDaMissao2 = "Não Concluida";
            }
        } else {
            statusDaMissao2 = "Concluida";
        }

        // Ninja 3
        String nomeNinja3 = "Kakashi";
        int idadeNinja3 = 25;
        String missão3 = "Defender os mais jovens";
        double nivelDeficuldadeMissao3 = 7.8;
        String statusDaMissao3 = "Concluido";

        if (idadeNinja3 < 18) {
            if (nivelDeficuldadeMissao3 >= 6) {
                statusDaMissao3 = "Concluida";
            }
            else {
                statusDaMissao3 = "Não Concluida";
            }
        } else {
            statusDaMissao3 = "Concluida";
        }


        System.out.println();
        System.out.println("Nome Ninja 1: " + nomeNinja1 + ", Idade do Ninja: "
                + idadeNinja1 + ", Missão: "
                + missão1 + ", Nivel de dificuldade: "
                + nivelDeficuldadeMissao1 + ", Status da missão: " + statusDaMissao1
        );
        System.out.println("--------------------------------------------------------");
        System.out.println("Nome Ninja 2: " + nomeNinja2 + ", Idade do Ninja: "
                + idadeNinja2 + ", Missão: "
                + missão2 + ", Nivel de dificuldade: "
                + nivelDeficuldadeMissao2 + ", Status da missão: " + statusDaMissao2
        );
        System.out.println("--------------------------------------------------------");
        System.out.println("Nome Ninja 3: " + nomeNinja3 + ", Idade do Ninja: "
                + idadeNinja3 + ", Missão: "
                + missão3 + ", Nivel de dificuldade: "
                + nivelDeficuldadeMissao3 + ", Status da missão: " + statusDaMissao3
        );
    }
}
