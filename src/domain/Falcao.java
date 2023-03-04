package domain;

public class Falcao extends Ave implements Voavel, Patrulhavel{

    public Falcao(String nome, Integer idade, String habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("Croac Croac!");
    }

    @Override
    public void voar() {
        System.out.println("Falcao voando!");
    }

    @Override
    public void patrulharTerritorio() {
        System.out.println("Falcao patrulhando!");
    }
    
}
