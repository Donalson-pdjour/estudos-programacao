public class Estoque{
    private int Quantidade;
    private String Localizazao;
    private String DatavencimentoProduto;
    private String Categoria;

    public void setQuantidade(int q){
        this.Qunatidade = q;
    }
    public int getQunatidade(){
        return Qunatidade;
    }
    public void setLocalizacao(String l){
        this.Localizazao = l;
    }
    public String getLocalizazao(){
        return Localizazao;
    }
    public void SetDatsvencimentoProduto(String dt){
        this.DatavencimentoProduto = dt;
    }
    public String getDatavencimentoProduto(){
        return DatavencimentoProduto;
    }
    public void setCategoria(String ca){
        this.Categoria = ca;
    }
    public String getCategoria(){
        return Categoria;
    }
}