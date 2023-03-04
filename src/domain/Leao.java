package domain;


public class Leao extends Mamifero implements Patrulhavel{

    public Leao(String nome, Integer idade, String habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("RRROOOOOOAAAAARRRRRRRRRRR!");
    }

    @Override
    public void patrulharTerritorio() {
        System.out.println("Leao patrulhando o territorio!");
    }
    
}
