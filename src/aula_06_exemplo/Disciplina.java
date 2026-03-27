package aula_06_exemplo;

public class Disciplina {
    private String nome_disciplina;
    private Professor p;
    private Aluno a;

    public Disciplina(String nome_disciplina){
        this.nome_disciplina = nome_disciplina;
    }

    public void setNomeDisciplina(String nome) {
        this.nome_disciplina = nome;
    }

    public String getNomeDisciplina() {
        return nome_disciplina;
    }

    public void associar(Professor p, Aluno a){
        this.p = p;
        this.a = a;
    }
    public void mostrarDisciplina() {
        System.out.println( p.getNome() + " ministra " + nome_disciplina + " Para o aluno " + a.getNome()
        );
    }
}

