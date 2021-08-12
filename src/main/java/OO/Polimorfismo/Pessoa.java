package OO.Polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso){
        setPeso(peso);
    }

   /* sobrecarga do método comer - polimorfismo estático
    public void comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void comer(Feijao feijao){
        this.peso += feijao.getPeso();
    }
    public void comer(Sorvete sorvete){
        this.peso += sorvete.getPeso();
    }*/

    //polimorfismo dinâmico, mais generico e melhor aproveitado.
    public void comer (Comida comida){
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso>=0){
            this.peso = peso;
        }
    }
}
