package aula_4_exercicio_2;

public class Pessoa {
    private String pessoa;
    private double altura;
    private double peso;
    private double imc;

    public String getPessoa() {
        return pessoa;
    }
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        imc = peso/(altura * altura);
        return imc;
    }
}

