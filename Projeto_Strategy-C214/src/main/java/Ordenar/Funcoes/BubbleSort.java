package Ordenar.Funcoes;

import java.util.List;

import Ordenar.Ordenador;

public class BubbleSort implements Ordenador{
    @Override
    public List<Integer> ordenaVetor(List<Integer> vetor) {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.size() - 1; i++) {
                if (vetor.get(i) > vetor.get(i + 1)) {
                    aux = vetor.get(i);
                    vetor.set(i, vetor.get(i + 1));
                    vetor.set(i + 1, aux);
                    troca = true;
                }
            }
        }
        return vetor;
    }
}

