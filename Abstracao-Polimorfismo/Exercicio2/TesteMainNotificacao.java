package Exercicio2;

public class TesteMainNotificacao {
    public static void main(String[] args) {

         Notificacao n1 = new SmsNotificacao();
         Notificacao n2 =  new EmailNotificacao();

         n1.enviar("Ola por email");
         n2.enviar("Ola por mensagem");
    }
}
