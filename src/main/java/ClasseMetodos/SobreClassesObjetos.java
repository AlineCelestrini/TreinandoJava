package ClasseMetodos;

public class SobreClassesObjetos {
/**arquivo chamado produto.Java(classe, qlq coisa java)
 * public - indica que a classe terá o mesmo nome que o arquivo raíz.
 * class -
 * main - método que é a porta de entrada do programa; deve ser contido dentro de uma classe para inicialização.
 * classe - define um bloco de código {}; contêm atributos(caracteristicas, dados) e comportamentos(verbo, métodos).
 * nome da classe - sempre colocar um nome que identifique a funcionalidade dela. Primeira letra de cada palavra sempre maiuscula, por convenção.
 * orientação à objetos - tentar aproximar o software ao mundo real, mostrando caracteristicas e compostamentos;
 *
 * CLASSE define um TIPO (estrutura de dados - primitivo ou não)
 *
 * CLASSE representa uma ABSTRAÇÃO (simplificação de um modelo do mundo real)
 *
 * OBJETOS são os dados criados a partir de determinada classe, ou seja, é uma INSTÂNCIA  de uma classe.
 *
 * CLASSE VS OBJETO - a classe é o molde que definirá a estrutura base geral e o objeto é a instância.
 * Cada instância pode adaptar suas particularidades a partir do molde.
 *
 * ATRIBUTO - cada um terá um tipo
 *
 * CONSTRUTOR - método especial responsável por criar objetos a partir de uma classe. Ex: Produto p1 = new Produto(nome, preço);
 * O nome do construtor será sempe igual ao nome da classe. Construtor padrão não recebe nenhum parametro.
 * O construtor não tem retorno, seu retorno será uma instância de uma classe/objeto. Essa é a diferença entre ele e o método.
 * O método sempre terá retorno(void, int, etc).
 *
 * CLASSE - contêm: variáveis/constantes, construtores, métodos, classes.
 *
 * MEMBROS DA CLASSE - atributos e comportamentos(dados que tem estruturas que definem o comportamento e a organização deles)
 * Notação ponto - forma de acessar os membros que pertencem aos objetos (métodos, contrutores, etc)
 *
 * FINAL - define que é uma CONSTANTE. Ex: (final static double PI = 3.1415;)
 *
 * THIS - usa nas classes instanciadas, diferenciando as variaveis da instancia das do método. Não funciona no método static.
 * Pode ser usado como método tb: this(), estabelecendo os parametros, mas sempre dentro de outro método construtor.
 *
 * VARIÁVEIS ou CONSTANTES LOCAIS - definidas dentro dos métodos, serão visíveis e acessadas somente dentro do método.
 * Os parâmetros definidos dentro de cada métodos, também são considerados LOCAIS.
 *
 * VARIÁVEIS ou CONSTANTES DA CLASSE - definidas dentro da classe e serão visíveis em toda ela. De preferencia mantê-las sempre no início da classe.
 *
 * VALORES PADRÃO - todas as variáveis locais devem ser inicializadas com algum valor. Se não tiver nenhum valos, elas serão inicializadas
 * com um valor padrão pré-definido por tabela. Geralmete: 0, false,\u0000, null.
 *
 * NULL - cuidado quando tiver uma variável do tipo objeto que não aponta para nenhum endereço na memória (null), porque quando for acessar um atributo
 * ou método, dará erro.
 *
 * ATRIBUIÇÃO POR VALOR(primitivos) VS ATRIBUIÇÃO POR REFERÊNCIA(objetos) - os comportamentos são completamente diferentes.
 * Por valor toda a lógica muda. Por referência do objeto o que for referenciado em um será obtido no outro(cópia do endereço/referencia de um objeto).
 * Método Clone - quando você quer que um objeto seja uma cópia de outro.
 *
 * GarbageColector - responsável por limpar os locais da memória que não estão sendo mais utilizados.
 *
 * STATIC - identifica que aquele atributo, método, constante, variável, construtor pertence ao objeto/classe por padrão e não à instância criada.
 * O valor ficará conforme definido na classe.
 *
 * Tudo que estiver em Java.lenght não precisa ser importado
 *
 * MÉTODOS - contem um algoritmo de execução de uma função, com entradas, processamentos e saídas. As vezes não tem saída.
 * Alguns métodos poderão ter parâmetros de entrada porém não ter parâmetro de saída;
 * Métodos que não terão parâmetros de entrada, porém terão saídas, retornos.
 * E métodos que não terão nem entradas e nem saídas.
 *
 * Anatomia do método:
 * void, String, int, etc(tipo do retorno do método) NomeDoMetodo(define os parametros ou não: tipo, nome, ...) {
 * define o corpo do método,
 * os algoritmos}
 *
 * IDENTIDADE OU ASSINATURA DO MÉTODO - NomeDoMetodo(parâmetros: tipo, nome, ... ou sem parâmetros)
 *
 * .*/

}
