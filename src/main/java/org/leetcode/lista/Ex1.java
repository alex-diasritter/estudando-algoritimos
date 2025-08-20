package org.leetcode.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
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

        List<Integer> listaNegativos = new ArrayList<>();
        for (int i : lista) {
            if (i < 0) {
                listaNegativos.add(i);
            }
        }

        System.out.println("Números negativos: ");
        listaNegativos.stream().forEach(i -> System.out.println(n));
    }
}