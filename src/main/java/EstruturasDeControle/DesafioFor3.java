package EstruturasDeControle;

public class DesafioFor3 {
    public static void main(String[] args) {
    //um for dentro de outro for
        for (int i =0; i<10;i++){
           for (int j=0; j<10;j++){
               System.out.printf("[%d %d]", i,j);
           }
            System.out.println();
        }
    }
}
