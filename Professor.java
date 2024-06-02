// Classe derivada "Professor"
public class Professor extends Pessoa {
    private String centro;

    public Professor(String nome, int idade, String centro) {
        super(nome, idade);
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula() {
        System.out.println("Dando aula...");
    }
}
