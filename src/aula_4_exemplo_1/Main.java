package aula_4_exemplo_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        p.setNome(sa.nextLine());
        System.out.println("Nome: " + p.getNome());

        System.out.println("Digite a sua Idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Idade: " + p.getIdade());

        System.out.println("Digite a sua Altura: ");
        p.setAltura(sc.nextDouble());
        System.out.println("Altura: " + p.getAltura());

        System.out.println("Digite uma fruta: ");
        p.setFruta(sa.nextLine());
        System.out.println("Fruta: " + p.getFruta());

    }
}
