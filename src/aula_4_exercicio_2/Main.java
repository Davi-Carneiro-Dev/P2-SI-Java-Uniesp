package aula_4_exercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Pessoa p = new Pessoa();

        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        p.setPessoa(sa.nextLine());

        System.out.println("Digite a sua altura: ");
        p.setAltura(sa.nextDouble());

        System.out.println("Digite o seu peso: ");
        p.setPeso(sa.nextDouble());

        System.out.println("Seu imc é: " + p.getImc());

    }
}
