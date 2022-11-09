package Ordenar.Funcoes;

import Ordenar.Ordenador;

import java.util.List;

public class InsertionSort implements Ordenador{
    @Override
    public List<Integer> ordenaVetor(List<Integer> vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.size(); j++)
        {
            key = vetor.get(j);
            for (i = j - 1; (i >= 0) && (vetor.get(i) > key); i--)
            {
                vetor.set(i + 1,  vetor.get(i));
            }
            vetor.set(i + 1, key);
        }
        return vetor;
    }
}
