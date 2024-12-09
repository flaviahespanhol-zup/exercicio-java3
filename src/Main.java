import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular uma SOMA, digite 1\n" +
                "Para calcular uma SUBTRAÇÃO, digite 2\n" +
                "Para calcular uma MULTIPLICAÇÃO, digite 3\n" +
                "Para calcular uma DIVISÃO, digite 4\n" +
                "Para calcular o RESTO de uma divisão, digite 5\n");

        int numeroConta = scanner.nextInt();
        System.out.println("Digite um número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numeroDois = scanner.nextInt();
        scanner.close();

        System.out.println("O resultado da operação é: ");
        calculadora(numeroConta, numeroUm, numeroDois);

    }

    public static void calculadora(int conta, int numero1, int numero2) {

        switch (conta) {
            case 1 -> {
                System.out.println(numero1 + numero2);
                break;
            }
            case 2 -> {
                System.out.println(numero1 - numero2);
                break;
            }
            case 3 -> {
                System.out.println(numero1 * numero2);
                break;
            }
            case 4 -> {
                if(numero2 == 0) {
                    System.out.println("ERRO. Um número NÃO pode ser dividido por zero");
                } else {
                    System.out.println(numero1 / numero2);
                }
                break;
            }
            case 5 -> {
                System.out.println(numero1 % numero2);
                break;
            }
            default -> System.out.println("ERRO. Essa operação matemática NÃO é válida.");
        }
    }
}