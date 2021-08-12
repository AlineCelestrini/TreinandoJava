package Lambda;

public class CalculoTest {
    public static void main(String[] args) {

        //utilizando classes
        Calculo soma = new Soma();
        System.out.println(soma.executar(5,8));

        Calculo multiplica = new Multiplicar();
        System.out.println(multiplica.executar(5,8));

        //utilizando expressão lambda , função anônima- interfaces e funções.

        Calculo calc = (x,y) -> {return x+y; };
        System.out.println(calc.executar(5,8));

        calc = (x, y) -> x*y;
        System.out.println(calc.executar(5,8));


    }
}
