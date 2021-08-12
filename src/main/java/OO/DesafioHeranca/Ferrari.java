package OO.DesafioHeranca;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

    /*void acelerar() {
        velocAtual += 15;
    }*/
   public Ferrari(){
        this(315);
    }
   public Ferrari(double velocMax){
        super(velocMax);
        setDelta(15);
    }

    @Override
    public void ligarTurbo(){
       //setDelta(35);
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo(){
       //setDelta(15);
        ligarTurbo = false;
    }

    @Override
    public void ligarAr(){
       ligarAr = true;
    }
    @Override
    public void desligarAr(){
        ligarAr = false;
    }

    @Override
    public int getDelta(){
       if(ligarTurbo && !ligarAr){
           return 35;
       }else if (ligarTurbo && ligarAr){
           return 30;
       }else if(!ligarTurbo && !ligarAr){
           return 20;
       }else{
           return 15;
       }

    }
}

