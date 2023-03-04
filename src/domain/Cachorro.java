package domain;


public class Cachorro extends Mamifero{

    public Cachorro(String nome, Integer idade, String habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
    
}
