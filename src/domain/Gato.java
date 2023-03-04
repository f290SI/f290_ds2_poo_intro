package domain;

import java.util.Scanner;

/*
 * Definição de classe em Java
 */
public class Gato {

    //Atributos
    public String nome;
    public Integer idade;
    public String cor;

    //Comportamentos
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public Gato(String nome) {
        this.nome = nome;
        this.idade = -1;
        this.cor = "não soube informar";
    }

    public Gato() {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o nome, idade e cor nesta ordem...");
        this.nome = in.nextLine();
        this.idade = in.nextInt();
        in.nextLine();
        this.cor = in.nextLine();
        in.close();
    }

    public void comer() {
        System.out.printf("%s já comeu!\n", nome);
    }

    public void dormir() {
        System.out.printf("%s está dormindo...\n", nome);
    }

    public void meow() {
        System.out.printf("%s: Meeooooowwwwwwww!\n", nome);
    }

    @Override
    public String   toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

}
