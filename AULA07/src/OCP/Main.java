package OCP;

public class Main {

    public static void main(String[] args) {
        double valorCompra = 1000.00;

        CalcularDesconto calculadora = new CalcularDesconto();

        DescontoComum comum = new DescontoComum();
        DescontoVip vip = new DescontoVip();

        double c = calculadora.calcular(comum, valorCompra);
        double v = calculadora.calcular(vip, valorCompra);

        System.out.printf(
                "Desconto cliente comum: R$ %.2f%n",
                c
                );
        System.out.printf(
                "Desconto cliente Vip: R$ %.2f%n"
                v  
        ) 
    }   
}
