package aula_1_exercicio_3;

public class Main {
    public static void main(String[] args) {

        double nota1=2;
        double nota2=3;
        double nota3=4;
        double mediatotal = (nota1+nota2+nota3)/3;
        double notaaprovado = 7;
        double notareprovado =4;

        System.out.println("Sua Média foi "+mediatotal);
        if (mediatotal >= notaaprovado) {
            System.out.println("Você foi aprovado!");
        } else if (mediatotal <= notareprovado) {
            System.out.println("Você está Reprovado!");
        } else {
            System.out.println("Você vai pra Final!");
        }


    }
}
