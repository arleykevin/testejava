// Classe derivada "Regular" de "Aluno"
public class Regular extends Aluno {
    public Regular(String nome, int idade, String matricula) {
        super(nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade regular...");
    }
}
