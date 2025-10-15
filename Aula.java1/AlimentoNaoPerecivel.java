public class AlimentoNaoPerecivel extends Alimento {
    protected String instrucaoConservacao;
    protected String conservacao;

    public void setInstrucaoConservacao(String ins) {
        this.instrucaoConservacao = ins;
    }

    public String getInstrucaoConservacao() {
        return instrucaoConservacao;
    }

    public void setConservacao(String cons) {
        this.conservacao = cons;
    }

    public String getConservacao() {
        return conservacao;
    }
}
