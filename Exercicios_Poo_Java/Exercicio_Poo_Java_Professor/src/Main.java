import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroProfessor cp = new CadastroProfessor();
        CadastroAluno ca = new CadastroAluno();

        System.out.println("Informe o nome do professor: ");
        cp.setNome(sc.next());
        System.out.println("Informe o seu endereço:");
        cp.setEndereco(sc.next());
        System.out.println("Informe a matrícula do professor: ");
        cp.setMatricula(sc.nextInt());
        System.out.println("Informe quantas horas trabalhadas: ");
        cp.setSalario(sc.nextDouble());
        double media = cp.getSalario() * cp.getHoras();
        System.out.println("O professor " + cp.getNome() + " com " + cp.getSalario() + "trabalhadas teve o salário de: " + media);


        System.out.println("Informe o nome do aluno: ");
        ca.setNome(sc.next());
        System.out.println("Informe quantas notas são: ");
        ca.setNotas(sc.nextDouble());
        int count = 0;
        double soma = 0;
        while (count < ca.getNotas()){
            System.out.print("Informe a " + (count + 1) + "nota: ");
            ca.setNota(sc.nextDouble());
            count += 1;
            soma += ca.getNota();
        }
        ca.setMedia(soma / count);
        if (ca.getMedia() >= 7){
            System.out.println("O aluno " + ca.getNome() + "Teve media " + ca.getMedia() + "e foi Aprovado!");
        }
        else if (ca.getMedia() < 4){
            System.out.println("O aluno " + ca.getNome() + "Tece nedia " + ca.getMedia() + "e foi Reprovado!! ");
        }
        else {
            System.out.println("O aluno " + ca.getNome() + "Teve media" + ca.getMedia() + " e foi para a Final!!");
        }



    }

}


