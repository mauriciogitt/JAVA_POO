package SRP;

public class Main {

public static void msin(Strinng [] args[]) {
    Funcionario funcionario = new funcionario ("Joao", 1000);

    FuncionarioRepository bd = new FuncionarioRepository();
    EmailService email = new Email.Service();
    RelatorioFuncionario relatorio = new RelatorioFuncionario

    bd.salvar(funcionario);
    email.enviar(funcinario);
    relatorio.gerar(funcinario);
}

}