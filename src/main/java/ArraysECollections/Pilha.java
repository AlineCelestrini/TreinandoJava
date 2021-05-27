package ArraysECollections;

import java.util.Deque;
import java.util.LinkedList;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new LinkedList<String>();
        livros.add("O Pequeno Principe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        livros.size();
    }
}
