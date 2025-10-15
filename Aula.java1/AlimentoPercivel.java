public class AlimentoPerecivel extends Alimento{
    protected String Temperatura;
    protected String PrazoAbertura;

    public void setTemperatura(String t){
        this.Temperatura = t;
    }
    public String getTemperatura(){
        return Temperatura;
    }
    public void setPrazoAbertura(String pa){
        this.PrazoAbertura = pa;
    }
    public String getPrazoAbertura(){
        return PrazoAbertura;
    }
}