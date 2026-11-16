/**
 * Representa um Vendedor. O campo administrador é sempre false.
 */

public class Vendedor extends Usuario {
    private int quantidadeDeVendas;


    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false); // administrador = false
        this.quantidadeDeVendas = 0;
    }
    //Getters e Setters


    public int getQuantidadeDeVendas() {return quantidadeDeVendas;}
    public void setQuantidadeDeVendas(int quantidadeDeVendas) {this.quantidadeDeVendas = quantidadeDeVendas;}


    //Metodos especificos do Vendedor
    public void realizarVenda(){
        quantidadeDeVendas ++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeDeVendas);

    }
    public void consultarVendas() {
        System.out.println("Total de vendas do vendedor " + nome + ": " + quantidadeDeVendas);
    }
    // Login, logoff, alteração de dados e senha são herdados.
}
