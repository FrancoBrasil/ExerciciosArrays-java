package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor: ");
            vetorA[i] = sc.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.print("VetoA = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("VetorB = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%.2f ", vetorB[i]);
        }

        sc.close();
    }
}
