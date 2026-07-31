package Exercicio3;

public class TesteMainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Resultado da soma com numeros inteiros: " + calc.somar( 3,  4));
        System.out.println("Resultado da soma com numeros fracionarios: " + calc.somar( 3.5,  4.5));
    }
}
