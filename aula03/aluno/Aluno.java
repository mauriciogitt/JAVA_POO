public class Aluno{
    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno(String nome, int matricula, Curso curso){
        this.nome = nome;
        this.matricula = matricula;
        this.cusro = curso;
    }

    public void apresentar(){
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: "+ matricula);
        System.out.println("Curso: "+ curso.getNome());
    }
}
