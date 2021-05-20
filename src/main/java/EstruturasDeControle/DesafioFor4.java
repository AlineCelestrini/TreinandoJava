package EstruturasDeControle;

public class DesafioFor4 {
    public static void main(String[] args) {

        String valor = "#";
        for (int i = 0; i < 5; i++){
            System.out.println(valor);
            valor += "#";
        }

        //versão do desafio - não pode usar valor numérico para controlar o laço.
        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
