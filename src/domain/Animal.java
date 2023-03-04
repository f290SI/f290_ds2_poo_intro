package domain;

public abstract class Animal {
    
    private String nome;
    private Integer idade;
    private String habitat;

    public Animal(String nome, Integer idade, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
        " [nome=" + nome + ", idade=" + idade + ", habitat=" + habitat + "]";
    }
    
}
