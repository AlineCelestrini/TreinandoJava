package ClasseMetodos.Classes;

public class DesafioEqualsHashcode {
    public static void main(String[] args) {

        UsuarioEquals u1 = new UsuarioEquals();
        u1.nome = "Aline";
        u1.email = "aline.celestrini@gmail.com";

        UsuarioEquals u2 = new UsuarioEquals();
        u2.nome = "Aline";
        u2.email = "aline.celestrini@gmail.com";

        System.out.println(u1==u2); //falso
        System.out.println(u1.equals(u2)); //falso e depois da implementação ele dará verdadeiro
        System.out.println(u2.equals(u1)); // igual o caso de cima


    }

}
