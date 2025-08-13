package org.leetcode.twosum;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        System.out.println("Iniciando a busca. Mapa está vazio: " + numMap);
        System.out.println("------------------------------------------");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(">>> Iteração " + i + " <<<");

            // O número atual que estamos analisando
            int numeroAtual = nums[i];
            System.out.println("Analisando o número: " + numeroAtual + " no índice " + i);

            // O 'complemento' é o valor que precisamos encontrar para somar com o número atual e chegar ao 'target'
            int complemento = target - numeroAtual;
            System.out.println("Calculando complemento: " + target + " - " + numeroAtual + " = " + complemento);

            // Verificamos se o mapa JÁ CONTÉM a chave que é o nosso 'complemento'
            System.out.println("Verificando se o mapa já contém o complemento (" + complemento + ")");

            if (numMap.containsKey(complemento)) {
                System.out.println(">>> SUCESSO! O complemento " + complemento + " foi encontrado no mapa!");
                System.out.println("O índice do complemento é: " + numMap.get(complemento));
                System.out.println("O índice do número atual é: " + i);
                System.out.println("Retornando os índices: [" + numMap.get(complemento) + ", " + i + "]");
                return new int[] { numMap.get(complemento), i };
            }

            // Se o complemento não foi encontrado, adicionamos o número ATUAL e seu índice ao mapa
            // Ele poderá ser o 'complemento' de algum número futuro
            System.out.println("O complemento " + complemento + " não está no mapa.");
            System.out.println("Adicionando o par (chave: " + numeroAtual + ", valor: " + i + ") ao mapa.");
            numMap.put(numeroAtual, i);

            System.out.println("Estado atual do mapa: " + numMap);
            System.out.println("------------------------------------------");
        }

        // Se o loop terminar, significa que nenhuma solução foi encontrada
        throw new IllegalArgumentException("Nenhuma solução de dois números encontrada");
    }

    public static void main(String[] args) {
        int[] ns = {11, 15, 7, 2};
        System.out.println("Array de entrada: {11, 7, 2, 15}, Target: 9\n");
        var r = twoSum(ns, 9);
        System.out.println("\nResultado final no main:");
        for (int i : r) {
            System.out.print(i + " "); // Saída esperada: 2 1 (ou 1 2, depende da implementação)
        }
    }
}