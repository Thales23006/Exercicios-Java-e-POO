package Exercicio5;
import java.util.List;

public class TesteMainAnimal {
    //para criar objetos e executar métodos 
    //precisamos do método main

    public static void main(String[] args) {
        //vamos criar uma lista de objetos de animais
        List<Animal> animais = 
            List.of(new Cachorro(), new Gato(), new Cabrito());


        for  (Animal animal : animais){
            animal.emitirSom(); //ligação dinâmica em tempo de execução
        }
    }
}
