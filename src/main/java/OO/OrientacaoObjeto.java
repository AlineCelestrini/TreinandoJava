package OO;

public class OrientacaoObjeto {
    /**
     * REUSO - PODE SER ATRAVÉS DE HERANÇA ou por RELACIONAMENTOS/Colaboração: um p um, um p muitos e muitos p muitos;
     * Um p um - um carro para um motor e vice versa;
     * um p muitos - um cliente para muitas compras
     * muitos p muitos - muitos alunos p muitas matérias
     *
     * Melhor utilização de cada um:
     * Composição - é mais: TEM UM(A)...
     * Herança - é mais: É UM(A)...
     *
     * PRIORIZAR O REUSO POR COMPOSIÇÃO POR SER MAIS FLEXÍVEL.
     *
     *
     * PARADIGMAS PROGRAMAÇÃO
     *
     * NÃO ESTRUTURADO - GOTO - BAGUNÇADO, programação "macarronica"
     *
     * PROCEDURAL - surgiram estruturas de controles e outras funções. Funções que manipulam dados.
     *
     * FUNCIONAL - criado baseado em funções, trabalha com constantes, composições
     *
     * ORIENTAÇÃO A OBJETO - foco no dado (estrutura), definido pela classe (atributo, comportamento)
     *
     * ENCAPSULAMENTO - quando parte da complexidade do objeto deverá estar escondida do mundo exterior.
     * Evita qlq tipo de acesso ao objeto e seus dados. Os MODIFICADORES DE ACESSO, são essenciais para isso.
     * Se dividem em:
     * PUBLIC: pode ser acessado por qlq classe do sistema, sem restrição.(maior visibilidade)
     * PROTECTED: ficam acessiveis para as classes dentro do mesmo pacote e em outro pacote quando passado/transmitido por herança.
     * PACKAGE(DEFAULT): só ficam acessiveis para as classes dentro do mesmo pacote. (por padrão é quando vc não define nada na frente dos atributos)
     * PRIVATE: os atributos só podem ser acessados dentro da propria classe, dentro dos metodos dela.(menor visibilidade)
     *
     * GETTERS/SETTERS - GET retorna e o SET altera, sem modificar o atributo privado da classe.
     *
     * HERANÇA (extends) - reuso de codigo através das caracteristiscas e comportamentos de outro objeto.
     * Todos os objetos que herdarem a classe pai, trarão os atributos e comportamentos dele, por isso a classe pai deve
     * ser a mais generica possível.
     * Sub Classe(+especifica - FILHO) herda--> SUPER CLASSE(+genérica - PAI)
     * Nem toda hierarquia tem ou é herança.
     *
     * POLIMORFISMO:
     * ESTÁTICO: sobrecarga com assinatura diferente, ou seja, mesmo nome, porém parâmetros diferentes,
     * funcionamento diferente, varias formas de funcionamento.
     * DINÂMICO: a partir de herança, vai instanciando a partir do tipo mais genérico, os objetos mais especificos,
     * que vão absorvendo e herdando os comportamentos.
     *
     * ABSTRAÇÃO - simplificação das complexidades do mundo real para um software. Transformar em objeto.
     * Nem tudo que está no mundo real estará no software e nem tudo que estará no software terá no mundo real.
     * Níveis de interpretar o software de formas diferentes de acordo com o negócio.
     * Entender o que é relevante ou não para o negócio do cliente. Nem tudo que o cliente diz é a verdade absoluta.
     *
     * CLASSE ABSTRATA - geralmente utilizadas por herança em outras classes. Seus métodos podem ou não ser definidos com corpo.
     * representa os conceitos dos objetos de forma abstrata no programa. Não pode ser instanciada. Os métodos abstratos podem ser
     * definidos ou não dentro das classes concretas.
     *
     *
     *
     *
     */

}
