package OO.ClasseAbstrata;

public class Cachorro extends Mamifero{

    @Override
    public String mover(){
        return "usa as patas";
    }

    @Override
    public String mamar(){
        return "Usando leite";
    }

}
