import domain.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        var gato = new Gato("Clovis", 5, "malhado");
        var gato1 = new Gato("Ozzy", 7, "cinza");

        var gato3 = new Gato("Felix");

        System.out.println(gato);
        
        // gato.comer();
        // gato.dormir();
        // gato.meow();

        System.out.println(gato1);
        // gato1.comer();
        // gato1.dormir();
        // gato1.meow();

        System.out.println(gato3);

        var gato4 = new Gato();
        System.out.println(gato4);
    }
}
