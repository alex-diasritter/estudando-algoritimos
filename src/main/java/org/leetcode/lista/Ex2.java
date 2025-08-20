package org.leetcode.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        System.out.print("Quantos números você quer digitar? ");
        int n = input.nextInt();

        while (n > lista.size()) {
            input.nextLine();
            System.out.print("Digite um número: ");
            lista.add(input.nextInt());
        }

        System.out.println(lista);
        int soma = 0;
        int media = 0;
        for (int num: lista) {
            soma += num;
            media = soma / 2;
        }
        System.out.println("Soma total: " + soma +
                "\nMédia: " + media);
    }
}