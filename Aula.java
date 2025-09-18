
import java.util.LinkedList;
import java.util.Queue;


public class Aula{
    public static void main(String[] args) {
        Queue<String> Nomes = new LinkedList<>();
        Nomes.add("Eduardo");
        Nomes.add("Maria");
        Nomes.add("João");
        Nomes.add("Carlos");
        Nomes.add("Ana");
        Nomes.add("Julia");
        Nomes.add("Pedro");

        System.out.println("Próximo: "+ Nomes.peek());
        System.out.println("A fila contém: "+Nomes);
        
        Nomes.poll();
        Nomes.poll();

        System.out.println("A fila contém, agora: "+ Nomes);
        System.out.println("A fila está vazia: "+Nomes.isEmpty());

    }
}