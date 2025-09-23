
import java.util.LinkedList;
import java.util.Queue;


public class Aula{
    public static void main(String[] args) {
         Queue<Double> Num = new LinkedList<>();
        Num.add(1.19);
        Num.add(3.79);
        Num.add(2.55);
        Num.add(4.85);
        Num.add(99.90);
        Num.add(1.90);
        Num.add(3.70);
        Num.add(5.66);
        Num.add(3.45);
        Num.add(7.89);

        System.out.println("A fila contém: "+Num);
        System.out.println("Próximo a ser removido: "+Num.peek());
        Num.poll();
        Num.poll();
        Num.poll();
        System.out.println("A fila contém: "+Num);
        System.out.println("\n Limpando todos itens da fila...");
        Num.clear();
        System.out.println("Fila após a limpeza: "+ Num);
        System.out.println("Fila está vazia: "+Num.isEmpty());
      
    }
}