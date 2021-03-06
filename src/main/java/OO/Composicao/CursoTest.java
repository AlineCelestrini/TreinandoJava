package OO.Composicao;

public class CursoTest {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Ana");
        Aluno aluno4 = new Aluno("Mara");
        Aluno aluno5 = new Aluno("Manu");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Angular");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso1.adicionarAluno(aluno4);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno3.adicionarCurso(curso3);
        aluno5.adicionarCurso(curso2);
        aluno2.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos) {
            System.out.println("Estou matriculado no curso " + curso1.nome + "...");
            System.out.println("... e o meu nome é "+ aluno.nome);
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }




    }
}
