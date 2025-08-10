package org.alex.adivinharNumero;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        int nAlvo = 48;
        while (true) {
            System.out.println("\nTente adivinhar o número alvo: ");
            var palpite = input.nextInt();

            if (palpite < nAlvo) {
                System.out.printf("\nQuase lá, o número alvo é maior que: %d!", palpite);

            } else if (palpite > nAlvo) {
                System.out.printf("\nPassou batido, o alvo é menor que: %d", palpite);

            } else {
                System.out.println("Parabéns! Você acertou!");
                break;
            }
        }
    }
}