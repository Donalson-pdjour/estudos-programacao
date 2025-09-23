public class Cliente{
    private String nome;
    private int idade;
    private String endereco;
    private String bairro;
    private String cpf; // CPF como String é mais seguro e flexível

    // Construtor vazio (opcional, mas boa prática)
    public Cliente() {}

    // Novo construtor para facilitar a criação de objetos
    public Cliente(String nome, int idade, String endereco, String bairro, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
    }

    // Métodos Getters e Setters seguindo a convenção Java
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Sobrescrevendo o método toString() para uma impressão amigável
    @Override
    public String toString() {
        return "Cliente{" +
                "nome=" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
