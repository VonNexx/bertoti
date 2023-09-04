public class Jogo {
    private String nome;
    private String desenvolvedor;
    private String distribuidora;
    private String gênero;
    private double preço;
    
    public Jogo(String nome, String desenvolvedor, String distribuidora, String gênero, double preço) {
        this.nome = nome;
        this.desenvolvedor = desenvolvedor;
        this.distribuidora = distribuidora;
        this.gênero = gênero;
        this.preço = preço;

        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGênero() {
        return gênero;
    }

    public void setGênero(String gênero) {
        this.gênero = gênero;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
