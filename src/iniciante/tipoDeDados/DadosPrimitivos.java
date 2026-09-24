package iniciante.tipoDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        Dados Primitivos: short, int, double, char, boolean
         */
        int idade = 16;
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 8525588747845852L;

        System.out.println("Sua inicial é: " + inicial);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu saldo atual é: " + saldoBancario);
        System.out.println("Você está vivo?: " + vivoOuMorto);
    }
}
