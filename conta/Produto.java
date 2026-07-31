public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public Produto(String nome, Double preco){
        this.nomeProduto = nome;
        this.precoProduto = preco;
    }
    public void setPreco(Double precoReajuste){
        if (precoReajuste > 0){
            this.precoProduto = precoReajuste;
        } else {
            System.out.println("Erro: preco nao pode ser negativo!");
        }
    }
    public Double getPrecoAtual(){
        return this.precoProduto;
    }
    public String getNomeProduto(){
        return this.nomeProduto;
    }
}
