package ex01;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];

        for (i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com os valor da posição " + i + ": ");
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("VetorA");
        for (i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }

        System.out.println("VetorB");
        for (i = 0; i < vetorA.length; i++) {
            System.out.println(vetorB[i] + " ");
        }

        sc.close();
    }

}
