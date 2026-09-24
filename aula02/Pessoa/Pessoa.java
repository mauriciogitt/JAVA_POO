public class Pessoa {
    String nome;
    private int idade;

    public Pessoa(String bananinha, int idade) {
        this.nome = nome;
        this.idade = idade; 
    }

    public String getNome (){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    
    void apresentar () {
        System.out.println("Ola! Meu nome e: " + nome)
    }

}