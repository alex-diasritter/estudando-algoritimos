package org.leetcode.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] lista = {1, 3, 5, 7, 9, 11, 13, 15};
        var i = buscaBinaria(lista, 3);

        if (i != -1) {
            System.out.println("Valor encontrado no índice: " + i);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

 /*
    BUSCA BINÁRIA
    Pegue o índice do meio.
    Compare o valor do meio com o valor que você está buscando.
    Se for igual, achou.
    Se o valor for menor, repita a busca na parte esquerda.
    Se for maior, repita na parte direita.
    Repita até encontrar ou não restar elementos.

    */

    public static int buscaBinaria(int[] lista, int valor){
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio+fim) / 2;

            if (lista[meio] == valor) {
                System.out.println("Achou!");
                return meio;

            } else if (lista[meio] < valor) {
                inicio = meio + 1;
            } else if (lista[meio] > valor) {
                inicio = meio - 1;
            }
        }
        return -1;
    }
}
/*   int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valor) {
                return meio; // encontrado
            } else if (array[meio] < valor) {
                inicio = meio + 1; // busca na metade direita
            } else {
                fim = meio - 1; // busca na metade esquerda
            }
        }
*/