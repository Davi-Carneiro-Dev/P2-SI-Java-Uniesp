package aula_2_exercicio3;

import java.util.Scanner;

public class aula_2_praticar_while {
    public static void main(String[] args) {
        String r ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Caso escolha 1: café da manhã, Caso escolha 2: Almoço");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Bom dia! Nosso café da manhã será servido das 6h às 10h!");
                    break;
                case 2:
                    System.out.println("Nosso restaurante abrirá a partir das 13h");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Para ver novamente, digite S");
            r = sc.next();
            } while (r.equalsIgnoreCase("S"));
    }
}
