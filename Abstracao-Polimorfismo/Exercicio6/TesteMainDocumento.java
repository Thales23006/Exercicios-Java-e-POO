package Exercicio6;

public class TesteMainDocumento {
    // método main de execução para dois objetos
    public static void main(String[] args) {
        //criando(instanciando) dois objetos
        // da classe impressora usando polimorfismo 

        Impressora imp = new Impressora();
        imp.imprimirDocumento(new PDF());
        imp.imprimirDocumento(new Word());


    }


}
