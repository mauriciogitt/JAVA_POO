public class Pessoa {
    String nome;
    int idade;

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa ();

        pessoa.nome = "Mark";
        pessoa.idade = 20;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: "+ pessoa.idade);
    }
}