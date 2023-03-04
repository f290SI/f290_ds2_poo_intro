import domain.Cachorro;
import domain.Leao;

public class App {
    public static void main(String[] args) throws Exception {
        var leao = new Leao("Alex", 5, "Savana");
        var cachorro = new Cachorro("Alvin", 2, "Doméstico");

        System.out.println(leao);
        leao.emitirSom();
        System.out.println(cachorro);
        cachorro.emitirSom();

        leao.patrulharTerritorio();
    }
}
