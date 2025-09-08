package org.leetcode.twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tentativa1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(2, 3, 3, 6, 4, 7, 8, 5, 7));

        var r = twoSum(list, 13);

        System.out.println("Main: " + r);

    }

    public static List<Integer> twoSum(List<Integer> list, int target) {

        Map<Integer, Integer> valores = new HashMap<>();

        for (int indexAtual = 0; indexAtual < list.size(); indexAtual++) {

            // complemento é apenas uma variável temporária
            int complemento = target - list.get(indexAtual);

            // se o complemento estiver no mapa, sucesso, encontramos os valores que somados dão target(13 no caso)
            // porque se o valor target - list.get(indexAtual) = a um complemento que já foi adicionado no mapa significa que encontramos os dois valores que somados dão target.
            if (valores.containsKey(complemento)) {

                System.out.println("Retornando os índices: [" + valores.get(complemento)+ ", " + indexAtual + "]");
                System.out.println("Valores: " + complemento + " (do indice: " + valores.get(complemento) + ") + " + list.get(indexAtual) + " (do indice: " + indexAtual + ") = " + target);

                return new ArrayList<>(List.of(valores.get(complemento), indexAtual));
            }

            valores.put(list.get(indexAtual), indexAtual);
        }
        throw new IllegalArgumentException();
    }

}