package Ordenar;

import static org.junit.Assert.*;

import Ordenar.Funcoes.SelectionSort;
import Ordenar.Funcoes.InsertionSort;
import Ordenar.Funcoes.BubbleSort;
import Ordenar.Ordena;
import Ordenar.OrdenaSelection;
import Ordenar.OrdenaInsertion;
import Ordenar.OrdenaBubble;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrdena {

    Ordena ordena;
    List<Integer> vetor;
    List<Integer> esperado;

    @Before
    public void init() {
        vetor = Arrays.asList(4, 6, 1, 7, 34, 9);
        esperado = Arrays.asList(1, 4, 6, 7, 9, 34);
    }

    @After
    public void reset(){
        vetor = null;
        esperado = null;
        ordena = null;
    }

    @Test
    public void testeOrdenaBubble() {
        ordena = new OrdenaBubble();
        List<Integer> ordenado = ordena.ordenaVetor(vetor);
        assertEquals(esperado, ordenado);
    }

    @Test
    public void testeOrdenaSelection() {
        ordena = new OrdenaSelection();
        List<Integer> ordenado = ordena.ordenaVetor(vetor);
        assertEquals(esperado, ordenado);
    }

    @Test
    public void testeOrdenaInsertion() {
        ordena = new OrdenaInsertion();
        List<Integer> ordenado = ordena.ordenaVetor(vetor);
        assertEquals(esperado, ordenado);
    }

    @Test
    public void testeInstanciaBubble() {
        ordena = new OrdenaBubble();
        assertTrue(ordena.getOrdenador() instanceof BubbleSort);
    }

    @Test
    public void testeInstanciaInsertion() {
        ordena = new OrdenaInsertion();
        assertTrue(ordena.getOrdenador() instanceof InsertionSort);
    }

    @Test
    public void testeInstanciaSelection() {
        ordena = new OrdenaSelection();
        assertTrue(ordena.getOrdenador() instanceof SelectionSort);
    }

}