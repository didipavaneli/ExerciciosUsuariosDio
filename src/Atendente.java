public class Atendente extends Usuario{
    private double valorEmCaixa;


    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false); //administrador = false
        this.valorEmCaixa = 0.0;
    }

    //Getters e setters


    public double getValorEmCaixa() {return valorEmCaixa;}
    public void setValorEmCaixa(double valorEmCaixa) {this.valorEmCaixa = valorEmCaixa;}

    //metodos especificos atendente
    public void receberPagamentos(double valor){
        if (valor < 0) {
            System.out.println("Valor inválido para pagamento.");
            return;
        }
        setValorEmCaixa(this.valorEmCaixa + valor);
        System.out.println("Pagamento recebido: R$ " + valor
                + ". Valor total em caixa: R$ " + this.valorEmCaixa);
    }
    public void fecharCaixa(){
        System.out.println("Fechando caixa. Valor total recolhido: R$ " + this.valorEmCaixa);
        setValorEmCaixa(0.0);
    }
    // Login, logoff, alteração de dados e senha são herdados.
}
