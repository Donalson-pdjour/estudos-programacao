import java.util.*;

public class Calcule {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite outro número: ");
                double num2 = scanner.nextDouble();
                double soma, subtracao, multiplicacao, divisao;
                soma = num1 + num2;
                subtracao = num1 - num2;
                multiplicacao = num1 * num2;
                divisao = num1 / num2;
                System.out.println("Soma: " + soma);
                System.out.println("Subtração: " + subtracao);
                System.out.println("Multiplicação: " + multiplicacao);
                if ((num1 == 0) || (num2 == 0)) {
                    System.out.println(" Não é possível dividir por zero.");
                } else {
                    System.out.println("Divisão: " + divisao);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida");

            }
        }

    }

}
