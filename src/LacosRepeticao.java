import java.util.Arrays;
import java.util.Scanner;

public class LacosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 números:");

        for(int index = 0; index < numeros.length; index++) {
            System.out.println("Digite um número para a posição " + index + ":");
            numeros[index] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(numeros));
    }

    }
