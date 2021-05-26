package ClasseMetodos.Classes;

public class UsuarioEquals {

    String nome;
    String email;

    //implementar o equals
    public boolean equals (Object objeto) {
        if (objeto instanceof UsuarioEquals) {
            UsuarioEquals outro = (UsuarioEquals) objeto;

            boolean nomeIgual = outro.nome == this.nome; //não é o método ideal de comparação para esse caso
            boolean emailIgual = outro.email.equals(this.email); //ideal para comparação nesse caso

            return nomeIgual && emailIgual;
            // return super.equals(objeto);
        }else{
            return false;
        }
    }


}
