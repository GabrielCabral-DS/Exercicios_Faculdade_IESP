public class Produto {
    private int codigo,quantidade_produto;
    private String nome;

    public void setNome(String next) {
        this.nome = nome;
    }

    public void setCodigo(int nextInt) {
        this.codigo = codigo;
    }

    public void setQuantidade_produto(int qtde) {
        this.quantidade_produto = qtde;
    }
    public void vendaProduto(int qtde){
        quantidade_produto = quantidade_produto - qtde;
    }

    public int getQuantidade_produto(){
        return quantidade_produto;
    }
}