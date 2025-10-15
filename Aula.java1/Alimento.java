public class Alimento{
    protected String Ingrediente;
    protected String Marca;
    protected String NomeProduto;
    protected String Armazenamento;
    protected String Embalagem;
    protected String Categoria;
    protected String Fabricante;

    public void setIngrediente(String in){
        this.Ingrediente = in;
    }
    public String getIngrediente(){
        return Ingrediente;
    }
    public void aetMarca(String ma){
        this.Marca = ma;
    }
    public String getMarca(){
        return Marca;
    }
    public void setNomeProduto(String np){
        this.NomeProduto = np;
    }
    public String getNomeProduto(){
        return NomeProduto;
    }
    public void setArmazenamento(String ar){
        this.Armazenamento = ar;
    }
    public String getArmazenamento(){
        return Armazenamento;
    }
    public void setEmbalagem(String emb){
        this.Embalagem = emb;
    }
    public String getEmbalagem(){
        return Embalagem;
    }
    public void setCategoria(String ca){
        this.Categoria = ca;
    }
    public String getCategoria(){
        return Categoria;
    }
    public void setFabricante(String fa){
        this.Fabricante = fa;
    }
    public String getFabricante(){
        return Fabricante;
    }
}