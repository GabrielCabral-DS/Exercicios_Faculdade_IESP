import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cadastro cad = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        cad.setNome(scanner.next());
        System.out.println("Informe a sua idade: ");
        cad.setIdade(scanner.nextInt());
        System.out.println("Informe o seu endereço: ");
        cad.setEndereco(scanner.next());
        System.out.println("O nome do usuário é : " + cad.getNome());
        System.out.println("A idade do usuário é : " + cad.getIdade());
        System.out.println("O endereço do usuário é : " + cad.getEndereco());

    }
}
