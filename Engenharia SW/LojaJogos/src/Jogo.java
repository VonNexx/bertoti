public class Jogo {
    private String nome;
    private Especicacao espec;
    private double preço;

    public Jogo(String nome, Especicacao espec, double preço) {
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

    public Especicacao getEspec() {
        return espec;
    }

    public void setEspec(Especicacao espec) {
        this.espec = espec;
    }
}
