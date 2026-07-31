package Exercicio1;
public class PagamentoCartao extends Pagamento {
    
    @Override
    protected double calcularTaxa(double valor) {
        return valor * 0.05;
    }


}
