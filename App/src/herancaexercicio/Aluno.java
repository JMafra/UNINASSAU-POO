package herancaexercicio;

public class Aluno extends Pessoa {

   private Curso curso;
   private static int totalAlunos;

    public Aluno(String nome, String cpf, int idade,Curso curso) {
        super(nome, cpf, idade);
        this.curso = curso;
        this.totalAlunos++;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }

}
