package Exercicio6;

public class Impressora {
    //método recebe tipo abstrato: polimorfismo em parâmetro 

    public void imprimirDocumento(Documento doc){
        doc.imprimir(); //ligação dinâmica 
    }
}
