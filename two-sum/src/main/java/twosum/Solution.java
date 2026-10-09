package twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numeros, int objetivo) {
        Map<Integer, Integer> indicePorValor = new HashMap<>(numeros.length * 2);

        for (int indiceAtual = 0; indiceAtual < numeros.length; indiceAtual++) {
            Integer indiceComplemento = indicePorValor.get(objetivo - numeros[indiceAtual]);

            if (indiceComplemento != null) {
                return new int[]{indiceComplemento, indiceAtual};
            }

            indicePorValor.put(numeros[indiceAtual], indiceAtual);
        }

        throw new IllegalArgumentException("Entrada incorreta!");
    }
}
