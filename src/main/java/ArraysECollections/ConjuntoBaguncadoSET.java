package ArraysECollections;

import java.util.HashSet;

public class ConjuntoBaguncadoSET {
    public static void main(String[] args) {

        HashSet conj = new HashSet();

        conj.add(1.2); //double - converte automaticamente para classe Double
        conj.add(true); // vai convertendo os primitivos em classes automaticamente
        conj.add("teste");
        conj.add(1);
        conj.add('a');

        System.out.println("Tamanho do conjunto é " + conj.size());
        System.out.println(conj);
        System.out.println(conj.remove("teste"));

        System.out.println("Tamanho do conjunto é " + conj.size());

        conj.clear();
    }
}
