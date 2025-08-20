package org.leetcode.twosum;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (numMap.containsKey(complemento)) {
                System.out.println(">>> SUCESSO! O complemento " + complemento + " foi encontrado no mapa!");
                System.out.println("O índice do complemento é: " + numMap.get(complemento));
                System.out.println("O índice do número atual é: " + i);
                System.out.println("Retornando os índices: [" + numMap.get(complemento) + ", " + i + "]");
                return new int[] { numMap.get(complemento), i };
            }
            numMap.put(nums[i], i); //adiciona numero atual como chave e o indice como valor
        }
        throw new IllegalArgumentException("Nenhuma solução de dois números encontrada");
    }

    public static void main(String[] args) {
        int[] ns = {11, 15, 7, 2};
        var r = twoSum(ns, 9);
        for (int i : r) {
            System.out.print(i + " ");
        }
    }
}