public class Main {
    public static void main(String[] args) {
        ContaBanco cb = new ContaBanco();
        cb.setDono("Gabriel");
        cb.setNumConta(1111);
        cb.abrirConta("CC");
        cb.depositar(100);
        cb.estadoAtual();

        ContaBanco cb1 =  new ContaBanco();
        cb1.setDono("Ducyanne");
        cb1.setNumConta(2222);
        cb1.abrirConta("CP");
        cb1.depositar(500);
        cb1.sacar(100);
        cb1.pagarMensal();
        cb1.estadoAtual();
    }

}
