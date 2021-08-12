package OO.DesafioHeranca;

public class Carro {
    protected double velocAtual;
    public final double VELOCMAX;
    private int delta =5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    protected Carro(double velocMax){
        VELOCMAX= velocMax;
    }
    public void acelerar() {
        if (velocAtual + getDelta() > VELOCMAX) {
            velocAtual = VELOCMAX;
        }else
            velocAtual += getDelta();
        }

    public void frear(){
        if (velocAtual >= 5){
            velocAtual -= 5;
        }else {
            velocAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é " + velocAtual + "Km/h.";
    }
}
