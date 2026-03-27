package aula_06_exemplo;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();
        Aluno a = new Aluno();

        Aluno a2 = new Aluno("Joao", 123);
        Aluno a3 = new Aluno("Josias", 123);
        Professor p2 = new Professor("Carlos");
        Disciplina d2 = new Disciplina("Portugues");

        d2.associar(p2,a3);
        d2.mostrarDisciplina();
    }
}
