package Exercicio1;
public abstract class Pagamento{
    

    public final void processar(double valor) {
        validar(valor);
        double taxa = calcularTaxa(valor);
        confirmar(valor + taxa);

    }

    protected void validar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }

    protected abstract double calcularTaxa(double valor);

    protected void confirmar(double total) {
        System.out.println("Pagamento confirmado: R$ " + total);
    }
}