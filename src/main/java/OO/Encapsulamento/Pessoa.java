package OO.Encapsulamento;

public class Pessoa {
    private int idade;
    private  String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
        //this.idade=idade;
    }
    //para tornar o atributo publico sem altera-lo - GETTER
    public int getIdade() {
        return idade;
    }

    //para alterar SETTER
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    public String toString(){
        return "Olá eu sou "+ getNome() + " tenho "+ getIdade() + " anos.";
    }
}
