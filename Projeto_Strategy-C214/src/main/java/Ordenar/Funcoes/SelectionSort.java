package Ordenar.Funcoes;

import Ordenar.Ordenador;

import java.util.List;
public class SelectionSort implements Ordenador{

    @Override
    public List<Integer> ordenaVetor(List<Integer> vetor) {
        for (int fixo = 0; fixo < vetor.size() - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < vetor.size(); i++) {
                if (vetor.get(i) < vetor.get(menor)) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vetor.get(fixo);
                vetor.set(fixo, vetor.get(menor));
                vetor.set(menor, t);
            }
        }
        return vetor;
    }
    }

