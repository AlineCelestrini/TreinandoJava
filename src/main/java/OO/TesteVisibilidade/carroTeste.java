package OO.TesteVisibilidade;

import OO.DesafioHeranca.Carro;
import OO.DesafioHeranca.Ferrari;
import OO.DesafioHeranca.Fox;

public class carroTeste {
    public static void main(String[] args) {

        Fox fox = new Fox();

        Carro ferrari = new Ferrari(350);

        fox.acelerar();
        fox.acelerar();
        fox.acelerar();
        fox.acelerar();
        fox.acelerar();
        fox.acelerar();
        System.out.println(fox);

        fox.frear();
        fox.frear();
        fox.frear();
        fox.frear();
        System.out.println(fox);
        fox.acelerar();
        System.out.println(fox);

        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari);

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

    }
}
