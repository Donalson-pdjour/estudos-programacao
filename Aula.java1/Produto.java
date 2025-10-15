public class Produto{
    private String NomeProduto;
    private long CodigodeBarras;
    private float ValorUnitario;
    private String Marca;
    private int Quantidade;

    public void setNomeProduto(String npr){
        this.NomeProduto = npr;
    }
    public String getNomeProduto(){
        return NomeProduto;
    }
    public void setCodigodeBarras(long cb){
        this.CodigodeBarras = cb;
    }
    public long getCodigodeBarras(){
        return CodigodeBarras;
    }
    public void setValorUnitario(float vu){
        this.ValorUnitario = vu;
    }
    public float getValorUnitario(){
        return ValorUnitario;
    }
    public void setMarca(String m){
        this.Marca = m;
    }
    public String getMarca(){
        return Marca;
    }
    private void setQuantidade(int qpr){
        this.Quantidade = qpr;
    }
    private int getQuantidade(){
        return Quantidade;
    }
}