package aula_3_exemplo_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Número 1");
        c.n1 = sc.nextInt();
        System.out.println("Numero 2");
        c.n2 = sc.nextInt();
        c.somar();
        System.out.println(c.total);

        sc.close();
    }
}
