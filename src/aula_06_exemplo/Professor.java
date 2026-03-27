package aula_06_exemplo;

public class Professor extends Pessoa{
    private double salario;
    public Professor() {
    }
    public Professor(String nome) {
        super(nome);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}