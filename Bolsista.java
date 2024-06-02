// Classe derivada "Bolsista" de "Aluno"
public class Bolsista extends Aluno {
    public Bolsista(String nome, int idade, String matricula) {
        super(nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade com bolsa...");
    }
}
