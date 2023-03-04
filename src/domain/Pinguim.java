package domain;

public class Pinguim extends Ave{

    public Pinguim(String nome, Integer idade, String habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("CUI CUI!");
        System.out.println("TRRIU TRRIU!");
    }
    
}
