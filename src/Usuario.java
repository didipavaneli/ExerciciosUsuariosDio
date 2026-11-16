/**
 * Classe abstrata que contém atributos e comportamentos comuns a todos os usuários.
 */

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected final boolean administrador; //imutavel apos criacao


    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }


    // getters e setters


    public String getNome() {return nome; }
    public void setNome(String nome) {this.nome = nome; }

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

    public boolean isAdministrador() {return administrador;}


    //Metodos genericos

    public void realizarLogin(){
        System.out.println(nome + " fez login.");
    }
    public void realizarLogoff(){
        System.out.println(nome + " fez logoff.");
    }

    public void alterarDados(String novoNome, String novoEmail){
        setNome(novoNome);
        setEmail(novoEmail);
        System.out.println("Dados atualizados: " + nome + " / " + email);
    }
    public void alterarSenha(String novaSenha){
        setSenha(novaSenha);
        System.out.println("Senha alterada com sucesso.");
    }
}