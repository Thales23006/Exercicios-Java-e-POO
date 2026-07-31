//Sistema de Login

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public Boolean autenticar(String senhaTentativa){
        return this.senha.equals(senhaTentativa);
    }
    public String getLogin(){
        return this.login;
    }
}
