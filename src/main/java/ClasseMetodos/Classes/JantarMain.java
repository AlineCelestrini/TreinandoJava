package ClasseMetodos.Classes;

public class JantarMain {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Alan", 79.5);
        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijão", 0.300);
        Comida c3 = new Comida("Carne Assada", 0.220);
        Comida c4 = new Comida("Salada de Maionese", 0.180);

        System.out.println(p1.Apresentar());
        p1.comer(c1);
        System.out.println(p1.Apresentar());
        p1.comer(c2);
        System.out.println(p1.Apresentar());
        p1.comer(c3);
        System.out.println(p1.Apresentar());
        p1.comer(c4);
        System.out.println(p1.Apresentar());
    }
}
