package OO.ClasseAbstrata;

public abstract class Mamifero extends Animal {

    @Override
    public String mover(){
        return "Usando as patas";
    }

    public abstract String mamar();
}