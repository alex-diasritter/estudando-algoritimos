package org.leetcode.twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tentativa1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 3, 3, 6, 4, 7, 8, 5, 7));
        var r = twoSum(list, 13);

    }

    public static List<Integer> twoSum(List<Integer> list, int target) {
        /*
        definir hash
        preciso iterar o array
        checar se o numero do index i + index anterior (i-1) é igual ao target
        se não for, adiciona o numero do index i como chave em um hashmap, e o index é adicionado como valor no hashmap
         */
        Map<Integer, Integer> valores = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int complemento = target - list.get(i);
            if (valores.containsKey(complemento)) {
                System.out.println("Sucesso.");
                System.out.println("Retornando os índices: [" + valores.get(complemento) + ", " + i + "]");
                return new ArrayList<>(List.of(valores.get(complemento), i));
            }
            valores.put(list.get(i), i);
        }
        throw new IllegalArgumentException();
    }

}