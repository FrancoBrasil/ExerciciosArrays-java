package ex07;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int qtdePares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("DIgite o valor: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.print("Números pares do Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdePares++;
                System.out.print(vetorA[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Qtde de Números pares = " + qtdePares);

        sc.close();
    }
}
