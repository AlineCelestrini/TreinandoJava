package ClasseMetodos.Classes;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){ }

    Data(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }

    String dataFormatada(){
        return String.format("%d/%d/%d", dia,mes,ano); //melhor forma de método, que retorna o resultado.
    }
    void imprimirDataFormatada(){
        System.out.println(dataFormatada()); //posso chamar um método dentro de outro método. Não é a melhor alternativa.
    }
}
