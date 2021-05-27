package ArraysECollections;

import java.util.HashSet;

public class HashCode {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Leonardo"));

        boolean result = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(result);
    }
}
