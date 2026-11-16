# Exercício de Hierarquia de Classes – Tipos de Usuários

**Enunciado**

Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, usando os seguintes requisitos:

1. **Classe `Gerente`**
   - **Atributos**:
     - `nome`
     - `email`
     - `senha`
     - `administrador` – deve ser sempre **verdadeiro**
   - **Métodos**:
     - `gerarRelatorioFinanceiro()`
     - `consultarVendas()`
     - `realizarLogin()`
     - `realizarLogoff()`
     - `alterarDados()`
     - `alterarSenha()`
   - **Getters/Setters**: para os atributos que façam sentido (ex.: nome, email, senha).

2. **Classe `Vendedor`**
   - **Atributos**:
     - `nome`
     - `email`
     - `senha`
     - `quantidadeDeVendas`
     - `administrador` – deve ser sempre **falso**
   - **Métodos**:
     - `realizarVenda()` – incrementa `quantidadeDeVendas` quando acionado
     - `consultarVendas()`
     - `realizarLogin()`
     - `realizarLogoff()`
     - `alterarDados()`
     - `alterarSenha()`
   - **Getters/Setters**: para os atributos relevantes (ex.: nome, email, senha, quantidadeDeVendas).

3. **Classe `Atendente`**
   - **Atributos**:
     - `nome`
     - `email`
     - `senha`
     - `valorEmCaixa`
     - `administrador` – deve ser sempre **falso**
   - **Métodos**:
     - `receberPagamentos(double valor)` – o método recebe um valor que deve ser incrementado em `valorEmCaixa`
     - `fecharCaixa()`
     - `realizarLogin()`
     - `realizarLogoff()`
     - `alterarDados()`
     - `alterarSenha()`
   - **Getters/Setters**: para os atributos relevantes (ex.: nome, email, senha, valorEmCaixa).

**Observações**
- Cada classe deve possuir os *getters* e *setters* apropriados.
- O atributo `administrador` deve ser **imutável** após a criação da instância, refletindo os valores fixos indicados acima.
- Os métodos de login, logoff, alteração de dados e senha podem ser implementados com lógicas simples, pois o foco deste exercício é a modelagem de classes e herança.

---

*
