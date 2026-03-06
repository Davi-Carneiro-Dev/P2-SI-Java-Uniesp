package aula_4_exercicio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Funcionario f = new Funcionario();

        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        f.setFuncionario(sa.nextLine());
        System.out.println("Nome: " + f.getFuncionario());

        System.out.println("Digite quantas horas por mês você trabalha: ");
        f.setHora(sc.nextInt());
        System.out.println("Horas Trabalhadas " + f.getHora());

        System.out.println("Digite o quanto você recebe por hora trabalhada: ");
        f.setSalario(sc.nextDouble());
        System.out.println("Valor da Hora: " + f.getSalario());

        System.out.println("Você Receberá " + f.getSalariofinal());








    }
}
