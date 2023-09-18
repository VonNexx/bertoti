public class Jogo {
    private String nome;
    private Especificacao espec;
    private Double preço;

    public Jogo(String nome, Especificacao espec, double preço) {
        this.nome = nome;
        this.espec = espec;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Especificacao getEspec() {
        return espec;
    }
}
