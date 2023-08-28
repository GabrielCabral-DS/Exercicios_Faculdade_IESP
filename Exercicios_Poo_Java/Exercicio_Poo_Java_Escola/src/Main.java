import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        escola.setAluno(teclado.next());
        System.out.println("Informe quantas notas são: ");
        escola.setQuantidade(teclado.nextInt());
        int count = 0;
        float soma = 0;
        while (count < escola.getQuantidade()){
            System.out.print("Informe a " + (count + 1) + "nota: ");
            escola.setNota(teclado.nextFloat());
            count += 1;
            soma += escola.getNota();
        }
        escola.setMedia(soma / count);
        if (escola.getMedia() >= 7){
            System.out.println("O aluno " + escola.getAluno() + "Teve media " + escola.getMedia() + "e foi Aprovado!");
        }
        else if (escola.getMedia() < 4){
            System.out.println("O aluno " + escola.getAluno() + "Tece nedia " + escola.getMedia() + "e foi Reprovado!! ");
        }
        else {
            System.out.println("O aluno " + escola.getAluno() + "Teve media" + escola.getMedia() + " e foi para a Final!!");
        }

    }

}
