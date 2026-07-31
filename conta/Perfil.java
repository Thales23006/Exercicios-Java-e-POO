public class Perfil {
    private String email;

    public void setEmail(String email){
        if (email.contains("@") && email.contains(".")){
            this.email = email;
            System.out.println("E-mail atualizado com sucesso!");
        } else {
            System.out.println("Forma de E-mail invalido!");
        }
    }
    public String getEmail(){
        return this.email;
    }
}
