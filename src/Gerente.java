/**
 * Representa um Gerente. O campo administrador é sempre true.
 */
public class Gerente extends Usuario{



    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true); // administrador = true
    }
    //Metodos especificos do gerente

    public void gerarRelatorioFinanceiro(){
        System.out.println("Gerando relatório financeiro para o gerente " + nome + ".");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas como gerente " + nome + ".");
    }
}
