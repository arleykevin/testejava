import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // criar 3 objetos de disciplina
        Disciplina disciplina1 = new Disciplina(1, "Java Orientado a Obejtos", 1);
        Disciplina disciplina2 = new Disciplina(2, "Ambiente de Dados", 2);
        Disciplina disciplina3 = new Disciplina(3, "Etica da Computação", 3);

        // imprimir informações das disciplinas
        System.out.println("Disciplina 1: " + disciplina1.getNome() + " - Código: " + disciplina1.getCodigo() + " - Semestre: " + disciplina1.getSemestre());
        System.out.println("Disciplina 2: " + disciplina2.getNome() + " - Código: " + disciplina2.getCodigo() + " - Semestre: " + disciplina2.getSemestre());
        System.out.println("Disciplina 3: " + disciplina3.getNome() + " - Código: " + disciplina3.getCodigo() + " - Semestre: " + disciplina3.getSemestre());

        // Criação de alunos
        Aluno aluno1 = new Regular("João", 20, "12345");
        Aluno aluno2 = new Regular("Maria", 22, "67890");
        Aluno aluno3 = new Bolsista("Pedro", 25, "11111");

        // Criação de professor
        Professor professor1 = new Professor("Ana", 30, "Tecnologia");
        Professor professor2 = new Professor("Joao", 34, "Tecnologia");
        Professor professor3 = new Professor("Pedro", 32, "Tecnologia");
        // Criação de turmas
        Turma turma1 = new Turma("T01", disciplina1.getNome(), professor1);
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);

        Turma turma2 = new Turma("T02", disciplina2.getNome(), professor2);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        Turma turma3 = new Turma("T03", disciplina3.getNome(), professor3);
        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno3);

        // Impressão das informações de cada turma
        System.out.println("Turma 1:");
        System.out.println("Código: " + turma1.getCodigo());
        System.out.println("Professor: " + turma1.getProfessor().getNome());
        System.out.println("Disciplina: " + turma1.getDisciplina());
        System.out.println("Alunos:");
        turma1.listarAlunos();
        System.out.println();

        System.out.println("Turma 2:");
        System.out.println("Código: " + turma2.getCodigo());
        System.out.println("Professor: " + turma2.getProfessor().getNome());
        System.out.println("Disciplina: " + turma2.getDisciplina());
        System.out.println("Alunos:");
        turma2.listarAlunos();
        System.out.println();

        System.out.println("Turma 3:");
        System.out.println("Código: " + turma3.getCodigo());
        System.out.println("Professor: " + turma3.getProfessor().getNome());
        System.out.println("Disciplina: " + turma3.getDisciplina());
        System.out.println("Alunos:");
        turma3.listarAlunos();
    }
}

