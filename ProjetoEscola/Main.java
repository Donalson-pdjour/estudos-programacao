import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import  java.util.List;
 public class Main{
        
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("João", LocalDate.of(2000, 5, 10));
        aluno1.notas.add(8.5);
        aluno1.notas.add(7.0);
        aluno1.notas.add(9.0);
        alunos.add(aluno1);

        Aluno aluno2 = new Aluno("Maria", LocalDate.of(2001, 3, 15));
        aluno2.notas.add(7.0);
        aluno2.notas.add(7.5);
        aluno2.notas.add(8.0);
        alunos.add(aluno2);

        Aluno aluno3 = new Aluno("Pedro", LocalDate.of(2002, 8, 20));
        aluno3.notas.add(4.5);
        aluno3.notas.add(3.5);
        aluno3.notas.add(7.0);
        alunos.add(aluno3);

        Aluno aluno4 = new Aluno("Ana", LocalDate.of(2003, 12, 5));
        aluno4.notas.add(7.0);
        aluno4.notas.add(6.5);
        aluno4.notas.add(8.5);
        alunos.add(aluno4);

        Aluno aluno5 = new Aluno("Carlos", LocalDate.of(2004, 1, 25));
        aluno5.notas.add(4.0);
        aluno5.notas.add(8.0);
        aluno5.notas.add(3.5);
        alunos.add(aluno5);

        Aluno aluno6 = new Aluno("Julia", LocalDate.of(2005, 6, 12));
        aluno6.notas.add(8.5);
        aluno6.notas.add(7.0);
        aluno6.notas.add(6.5);
        alunos.add(aluno6);

        // Imprimir todos os alunos
        System.out.println("Todos os alunos:");
        for (Aluno aluno : alunos) {
        System.out.println(aluno);
        }
        // Ordenar por nome collections.sort
        Collections.sort(alunos, new Comparator<Aluno>(){
        @Override
        public int compare(Aluno a, Aluno b){
        return a.nome.compareTo(b.nome);
        }
});
        System.out.println("\nAlunos ordenados por nome:");
        alunos.forEach(System.out::println);

        //Remove alunos com média abaixo de 6
        Iterator<Aluno> it = alunos.iterator();
        while (it.hasNext()){
                Aluno a = it.next();
                if (a.calcularMédia() < 6.0){
                it.remove();
                System.out.println("\nAluno removido: " + a.nome);
                }
        }
        // Imprimir alunos após remoção
        System.out.println("\nAlunos após remoção:");
        for (Aluno aluno : alunos) {
        System.out.println(aluno);
        }

        // Ordenar alunos por média (do menor para o maior)
        alunos.sort(Comparator.comparingDouble(Aluno::calcularMédia));
        System.out.println("\nAlunos ordenados por média (menor para maior):");
        for (Aluno aluno : alunos) {
        System.out.println(aluno);
        }
        alunos.sort((d1, d2) -> Double.compare(d1.calcularMédia(), d2.calcularMédia()));
        System.out.println("\n top alunos por média: ");
        for(int i = 0; i < Math.min(3, alunos.size()); i++){
                System.out.println((i + 1) + "° - " + alunos.get(i));
        }
        List<String> disciplinas = Arrays.asList("Matemática", "Física", "Química", "História", "Geografia");
        System.out.println("\n Disciplinas: "+ disciplinas);
    
}

}