package ArraysECollections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();

        //Offer e Add -> adicionam elementos na fila. Diferença é o comportamento quando a fila está cheia.

        fila.add("Ana");
        fila.offer("Aline");
        fila.add("Jhon");
        fila.offer("Mama");
        fila.add("Ole");
        fila.offer("Maria");


        // Peek e Element -> obter o proximo elemento da fila, sem remover. A diferença de comportamento ocorre quando a fila está vazia
        System.out.println(fila.peek()); //retorna falso se a fila estiver vazia
        System.out.println(fila.element()); //lança uma exceção quando a fila estiver vazia

        //fila.size();  verifica o tamanho da fila
        //fila.isEmpty(); saber se a fila está vazia


        //Pool e Remove - obtem o proximo elemento da fila e remove.
        //Tem diferença no comportamento quando a fila está vazia
        fila.poll(); //retorna falso(vazio)
        fila.remove(); //lança uma exceção(vazio)
    }
}
