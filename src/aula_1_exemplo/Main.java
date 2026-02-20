package aula_1_exemplo;

public class Main {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;
        int totalsoma;
        int totalsub;
        double totalmulti;
        double totaldiv;

        totalsoma = num1+num2;
        totalsub = num1-num2;
        totalmulti = num1*num2;
        totaldiv = num1/num2;

        System.out.println("O Total da Soma é "+totalsoma);
        System.out.println("O Total da Subtração é "+totalsub);
        System.out.println("O Total da Multiplicação é "+totalmulti);
        System.out.println("O Total da Divisão é "+totaldiv);

        if (num1 > num2) {
            System.out.println("O numero 1 é Maior");
        }else if (num1 == num2) {
            System.out.println("O numero 1 é igual ao numero 2");
        }else {
            System.out.println("O numero 1 é Menor");

        }

    }
}
