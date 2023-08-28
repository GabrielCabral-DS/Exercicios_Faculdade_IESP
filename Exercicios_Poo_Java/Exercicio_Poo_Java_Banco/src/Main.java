import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        banco.setNome(teclado.next());
        System.out.println("Olá " + banco.getNome() + " o seu saldo em conta é de: " + banco.getValor());
        System.out.println("Você deseja sacar (1) ou depositar (2): ");
        banco.setOpcao(teclado.nextInt());
        if (banco.getOpcao() == 1){
            System.out.println("Informe o valor que você deseja sacar: ");
            banco.setSaque(teclado.nextFloat());
            float sacar = banco.getValor() - banco.getSaque();
            System.out.println("O usuário: " + banco.getNome() + "Sacou" + banco.getSaque() + "e seu saldo é de: " + sacar);
        }
        else if (banco.getOpcao() == 2) {
            System.out.println("Informe o valor que você deseja depositar: ");
            banco.setDeposito(teclado.nextFloat());
            float sacar = banco.getValor() + banco.getDeposito();
            System.out.println("O usuário: " + banco.getNome() + "Depositou" + banco.getDeposito() + "e seu saldo é de: " + sacar);
        }
        else {
            System.out.println("Opção não Existente!!!");
        }
    }
}

