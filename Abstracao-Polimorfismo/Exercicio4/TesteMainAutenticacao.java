package Exercicio4;
public class TesteMainAutenticacao {
    public static void main(String[] args) {
        Autenticavel admin = new Administrador(); 
    

    admin.setNome("Regiano ALves ");

    System.out.println("O usuario " + admin.getNome() + " foi autenticado? " + admin.autenticar("123") );


}

}