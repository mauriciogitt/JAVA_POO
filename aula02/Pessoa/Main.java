public class Main {
     public static void main (String[] args){
        Pessoa pessoa1 = new Pessoa("Joao", 20);

        System.out.println (pessoal.getNome());
        System.out.println (pessoa1.getIdade());

        pessoa1.nome = "Carlos";
        pessoa1.idade = 20;

        pessoa1.apresentar();
    }
}