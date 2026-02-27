package aula_1_exercicio_4;

public class Main {
    public static void main(String[] args) {

        double salario=800;
        double desc5 =900.00;
        double desc10 =1500.00;
        double desc20 =2500.00;

        if (salario <= desc5) {
            System.out.println("Seu salário de "+salario+" está isento de desconto.");
        } else if (salario <= desc10) {
            System.out.println("Seu salário de "+salario+" terá 5% de desconto.");
        } else if (salario <= desc20) {
            System.out.println("Seu salário de "+salario+" terá 10% de desconto.");
        } else {
            System.out.println("Seu salário de "+salario+" terá 20% de desconto.");
        }


    }
}
