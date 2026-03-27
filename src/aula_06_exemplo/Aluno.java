package aula_06_exemplo;

public class Aluno extends Pessoa {
    private int matricula;
    public Aluno() {
    }
    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}