package Ordenar;

import java.util.List;

public abstract class Ordena {

    protected Ordenador ordenador;

    public List<Integer> ordenaVetor(List<Integer> vetor){
        return ordenador.ordenaVetor(vetor);
    }

    public void setOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    public Ordenador getOrdenador() {
        return ordenador;
    }
}
