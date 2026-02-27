package aula_3_exemplo_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        p.nome =sa.nextLine();

        System.out.println("Digite a sua Idade: ");
        p.idade =sc.nextInt();

        System.out.println("Digite a sua Altura: ");
        p.altura =sc.nextDouble();

        System.out.println("Seu nome: "+p.nome+"\nsua idade: "+ p.idade+"\nsua altura: "+p.altura);
        p.fazAniversario();


    }
}
