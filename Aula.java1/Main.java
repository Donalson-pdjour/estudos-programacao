public class Main {
    public static void main(String[] args) {

        Pessoa pa = new Pessoa();
        pa.setNomePessoa("Maria Silva");
        pa.setIdade(28); // melhor ser int
        pa.setCpf("23456789090");

        System.out.println("******************");
        System.out.println("Nome da pessoa: " + pa.getNomePessoa());
        System.out.println("Idade: " + pa.getIdade());
        System.out.println("CPF: " + pa.getCpf());
        System.out.println("--------------------");


        Venda ve = new Venda();
        ve.setNumeroNotefiscal("1001");
        ve.setDataVenda("21/08/2025");
        ve.setHoraVenda("14:35");
        ve.setValorTotal(409.90);

        System.out.println("*******************");
        System.out.println("Número da nota fiscal: " + ve.getNumeroNotefiscal());
        System.out.println("Data da venda: " + ve.getDataVenda());
        System.out.println("Horário da venda: " + ve.getHoraVenda());
        System.out.println("Valor Total da venda: " + ve.getValorTotal());
        System.out.println("---------------------");


        Estoque es = new Estoque();
        es.setQuantidade(50);
        es.setLocalizacao("A1 - Prateleira");
        es.setDatavencimentoProduto("15/09/2025");
        es.setCategoria("Medicamento");

        System.out.println("*********************");
        System.out.println("Quantidade de produto: " + es.getQuantidade());
        System.out.println("Localização: " + es.getLocalizacao());
        System.out.println("Data de vencimento: " + es.getDatavencimentoProduto());
        System.out.println("Categoria: " + es.getCategoria());
        System.out.println("----------------------");


        Produto pr = new Produto();
        pr.setNomeProduto("Arroz Tipo 1 - 5kg");
        pr.setCodigodeBarras(7891000100101L); // precisa do "L" pq é long
        pr.setValorUnitario(25.90);
        pr.setMarca("Tio João");
        pr.setQuantidade(120);

        System.out.println("***********************");
        System.out.println("Nome do Produto: " + pr.getNomeProduto());
        System.out.println("Código de Barras: " + pr.getCodigodeBarras());
        System.out.println("Valor Unitário: " + pr.getValorUnitario());
        System.out.println("Marca: " + pr.getMarca());
        System.out.println("Quantidade: " + pr.getQuantidade());
        System.out.println("------------------------");


        Fornecedor fo = new Fornecedor();
        fo.setNomeFornecedor("João da Silva");
        fo.setTelefone("11 94479-1356"); // String
        fo.setCnpj("12.345.678/0001-99");
        fo.setEmail("contato@silvaalimentos.com.br");
        fo.setEndereco("Rua das Palmeiras");
        fo.setNumero(1200);
        fo.setRazaoSocial("Silva Alimento LTDA");
        fo.setBairro("Centro");
        fo.setCidade("São Paulo");
        fo.setEstado("SP");
        fo.setCep("01001000"); // String
        fo.setComplemento("Sala 09");
        fo.setNomeFantasia("Silva Alimento");
        fo.setInscricaoEstadual("123.456.789.112"); // String

        System.out.println("*********************");
        System.out.println("Fornecedor: " + fo.getNomeFornecedor());
        System.out.println("Telefone: " + fo.getTelefone());
        System.out.println("CNPJ: " + fo.getCnpj());
        System.out.println("E-mail: " + fo.getEmail());
        System.out.println("Endereço: " + fo.getEndereco() + ", " + fo.getNumero());
        System.out.println("Razão Social: " + fo.getRazaoSocial());
        System.out.println("Bairro: " + fo.getBairro());
        System.out.println("Cidade: " + fo.getCidade());
        System.out.println("Estado: " + fo.getEstado());
        System.out.println("CEP: " + fo.getCep());
        System.out.println("Complemento: " + fo.getComplemento());
        System.out.println("Nome Fantasia: " + fo.getNomeFantasia());
        System.out.println("Inscrição Estadual: " + fo.getInscricaoEstadual());
        System.out.println("-------------------------");


        AlimentoPerecivel ap = new AlimentoPerecivel();
        ap.setTemperatura("5°C");
        ap.setPrazoAbertura("3 dias");

        System.out.println("************************");
        System.out.println("Temperatura: " + ap.getTemperatura());
        System.out.println("Prazo de abertura: " + ap.getPrazoAbertura());
        System.out.println("-------------------------");


        AlimentoNaoPerecivel anp = new AlimentoNaoPerecivel();
        anp.setInstrucaoConservacao("Local seco e arejado");
        anp.setConservacao("Validade até 2 anos");

        System.out.println("************************");
        System.out.println("Instrução de conservação: " + anp.getInstrucaoConservacao());
        System.out.println("Conservação: " + anp.getConservacao());
        System.out.println("-------------------------");

    }
}
