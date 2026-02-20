package aula_2_exercicio2;

import java.util.Scanner;

public class aula_2_praticar_switch_case {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            int num1=sc.nextInt();

            System.out.println("Digite o segundo número");
            int num2=sc.nextInt();

            System.out.println("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão !");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    double add=num1+num2;
                    System.out.println("O resultado é "+add+" !");
                    break;
                case 2:
                    double sub=num1-num2;
                    System.out.println("O resultado é "+sub+" !");
                    break;
                case 3:
                    double mul=num1*num2;
                    System.out.println("O resultado é "+mul+" !");
                    break;
                case 4:
                    double div=num1/num2;
                    System.out.println("O resultado é "+div+" !");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            sc.close();
        }
}

