package ArraysECollections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Luzia"));
        lista.add(new Usuario("Angelo"));

        System.out.println(lista.get(5)); //acesso pelo indice

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }

        lista.remove(2);
        lista.clear();
    }
}
