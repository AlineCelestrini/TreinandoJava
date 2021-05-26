package ArraysECollections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportadoSET {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<String>(); //utilização de anotação generics entre <>
        lista.add("Aline");
        lista.add("Alo");
        lista.add("oi");

        for (String candidato: lista) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(8);
        nums.add(2);
        nums.add(6);
        nums.add(4);

        for (int n:nums) {
            System.out.println(n);
        }
    }
}
