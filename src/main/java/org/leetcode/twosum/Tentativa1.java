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

        for (int index = 0; index < list.size(); index++) {

            int complemento = target - list.get(index);

            if (valores.containsKey(complemento)) {

                System.out.println("Retornando os índices: [" + valores.get(complemento)+ ", " + index + "]");
                System.out.println("Valores: " + complemento + " (do indice: " + valores.get(complemento) + ") + " + list.get(index) + " (do indice: " + index + ") = " + target);

                return new ArrayList<>(List.of(valores.get(complemento), index));
            }

            valores.put(list.get(index), index);
        }
        throw new IllegalArgumentException();
    }

}