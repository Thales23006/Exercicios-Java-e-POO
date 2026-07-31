package Exercicio4;

public class Administrador extends Usuario implements Autenticavel{


    @Override
    public boolean autenticar(String senha){
        return "123".equals(senha);
        
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nomeUsuario) {
        super.setNome(nomeUsuario);
    }
}
