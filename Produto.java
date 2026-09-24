public class Produto {
    String nome;
    double preco
    int quantidade;

    public static void main(String[] args) {
        Produto produto = new Produto ();

        Produto.nome = "Arroz";
        Produto.preco = 37.90;
        Produto.quantidade = 2;

        System.out.println("Nome: " + produto.nome);
        System.out.println("Preco: " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);

    }
     
}