public class Principal {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", "ana@empresa.com", "senha123");
        Vendedor v = new Vendedor("Bruno", "bruno@empresa.com", "senha456");
        Atendente a = new Atendente("Carla", "carla@empresa.com", "senha789");
        // Gerente
        g.realizarLogin();
        g.gerarRelatorioFinanceiro();
        g.consultarVendas();
        g.realizarLogoff();
        // Vendedor
        v.realizarLogin();
        v.realizarVenda();   // +1 venda
        v.realizarVenda();   // +1 venda
        v.consultarVendas(); // deve mostrar 2
        v.realizarLogoff();
        // Atendente
        a.realizarLogin();
        a.receberPagamentos(150.0);
        a.receberPagamentos(200.0);
        System.out.println("Valor em caixa: R$ " + a.getValorEmCaixa());
        a.fecharCaixa();
        a.realizarLogoff();
    }
}