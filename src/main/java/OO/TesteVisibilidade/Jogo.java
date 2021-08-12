package OO.TesteVisibilidade;

import OO.Heranca.Direcao;
import OO.Heranca.Heroi;
import OO.Heranca.Jogador;
import OO.Heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        /*Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 10;*/

        //j1.andar(Direcao.NORTE);

        Heroi heroi = new Heroi(10,11);
        //heroi.x = 10;
        //heroi.y = 11;

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 12;

        System.out.println("Monstro tem=> "+ monstro.vida);
        System.out.println("Herói tem=> "+ heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem=> "+ monstro.vida);
        System.out.println("Herói tem=> "+ heroi.vida);

        //heroi.andar(Direcao.LESTE);

    }
}
