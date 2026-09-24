public class Professor{
    private String nome;
    private int matricula;

    public Professor(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }
}