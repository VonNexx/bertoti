public class Especificacao {
    private String desenvolvedor;
    private String distribuidora;
    private String genero;

    public Especificacao(String desenvolvedor, String distribuidora, String genero) {
        this.desenvolvedor = desenvolvedor;
        this.distribuidora = distribuidora;
        this.genero = genero;
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
