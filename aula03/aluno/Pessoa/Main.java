public class Main{
    public static void main(String[] args){
        Endereco endereco = new Endereco("Rua 18", 0505540);

        Pessoa pessoa = new Pessoa ("Maria", endereco);

        pessoa.cadastro();
    }
}