import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Aluno {
    String nome;
    LocalDate anoNascimento;
    List<Double> notas;

    public Aluno(String nome, LocalDate anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.notas = new ArrayList<>();
    }
    // Calcul a média das notas
    double calcularMédia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.size();
    }
    // mostra o aluno na tela 
    public String toString(){
        return nome + "(" + anoNascimento.getYear() + ") - Média: " + String.format("%.2f", calcularMédia());
    }
    //Implementação de equals e hasCode (Boa Prática para usa em collextion)
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Aluno other = (Aluno) obj;
        return nome.equals(other.nome) && anoNascimento.equals(other.anoNascimento);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nome, anoNascimento);
    
    }

}