public class Conta {
    private String nomeTitularConta;
    private Double saldoConta = 0.0;

    //método construtor

    public Conta(String titular){
        this.nomeTitularConta = titular;
    }
    public Double getSaldo(){
        return this.saldoConta;
    }
    public String getTitularConta(){
        return this.nomeTitularConta;
    }

    // criando método que encapsula deposito

    public void depositar(Double valorDeposito){
        if (valorDeposito > 0){
            this.saldoConta += valorDeposito;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor invalido para deposito!");
        }
    }
}