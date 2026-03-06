package aula_4_exercicio_1;

public class Funcionario {
    private  String funcionario;
    private int hora;
    private double salario;
    private double salariofinal;

    public String getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalariofinal() {
        salariofinal = hora * salario;
        return salariofinal;
    }


}


