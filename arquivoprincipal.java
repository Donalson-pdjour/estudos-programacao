import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo ao Java!");
        
        entrada.close();
    }
}