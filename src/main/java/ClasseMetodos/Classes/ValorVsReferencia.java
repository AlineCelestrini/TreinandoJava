package ClasseMetodos.Classes;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;//atribuição por valor

        a++;
        b--;

        System.out.println(a+"  "+b);

        Data d1 = new Data(1,2,2010);
        Data d2 = d1;//atribuição por referência(Objeto)

        d1.dia=31;
        d2.mes=12;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        voltarDataParaValorPadrao(d1);//método alterou os dados na memória

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        int c = 5;
        alterarPrimitivo(c);//não gera impacto fora do código
        System.out.println(c);
    }

    //não é o método ideal
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 2015;
    }

    //não gera impacto fora do código
    static void alterarPrimitivo(int a){
        a++;
    }
}
