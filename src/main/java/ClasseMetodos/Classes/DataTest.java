package ClasseMetodos.Classes;

public class DataTest {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 31;
        d1.mes = 12;
        d1.ano = 1986;

        System.out.println(d1.dataFormatada()); //formatação pelo método

        var d2 = new Data();
        d2.dia = 7;
        d2.mes = 9;
        d2.ano = 1955;

        System.out.printf("\n %d / % d / %d \n ", d2.dia, d2.mes, d2.ano);
        d2.imprimirDataFormatada();

        Data d3 = new Data(01,01,1970);
        d3.imprimirDataFormatada();
    }
}
