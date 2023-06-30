
public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Infome o nome do produto: ");
        prod.setNome(Teclado.next());

        System.out.println("Informe o codigo do produto: ");
        prod.setCodigo(Teclado.nextInt());

        System.out.println("Informe a quantidade do produto: ");
        prod.setQuantidade_produto(Teclado.nextInt());

        System.out.print("Produtos cadastrados com sucesso!!!");
        System.out.println(prod.getQuantidade_produto());
        System.out.println("Você deseja realizar uma venda ? [S(1)/N(0)]: ");
        int opcao = Teclado.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Quantos você deseja vender? ");
                int qtde = Teclado.nextInt();
                prod.vendaProduto(qtde);
                System.out.println("A quantidade atual do produto é: ");
                System.out.println(prod.getQuantidade_produto());
                break;
            case 0:
                System.out.println(" A quantidade do produto permanece a mesma: ");
                break;
            default:
                System.out.println("ERRO, OPÇÃO INCORRETA!!!");
        }
    }
}