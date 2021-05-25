package ClasseMetodos.Classes;

public class PrimeiroTrauma {

    int a = 3; //desafio
    static int b = 5;
    public static void main(String[] args) {

        //precisa instanciar primeiro para depois acessar os atributos da classe
        PrimeiroTrauma p = new PrimeiroTrauma();
        System.out.println(p.a);

        System.out.println(b);//ou transformando a variavel em membro estatico, pq um membro estatico consegue acessar outro membro estatico.

    }
}
