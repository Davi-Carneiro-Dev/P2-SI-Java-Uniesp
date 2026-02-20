package aula_2_exemplo;

import java.util.Scanner;

public class aula_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        System.out.println("Informe um Nome de um ser humano.");
        String nome= sa.nextLine();

        System.out.println("Informe a sua idade.");
        int idade= sc.nextInt();

        System.out.println("Informe a sua altura. ");
        double altura= sc.nextDouble();

        System.out.println("Informe seu peso.");
        double peso= sc.nextDouble();

        System.out.println("Informe sua fruta favorita.");
        String fruta= sa.nextLine();

        System.out.println("Esse é o seu nome: "+nome+" !");
        System.out.println("Essa é a sua idade: "+idade+" !" );
        System.out.println("Essa é a sua altura: "+altura+" !");
        System.out.println("Esse é o seu peso: "+peso+"kg !");
        System.out.println("Essa é a sua fruta favorita: "+fruta+" !");
        sc.close();



    }
}
