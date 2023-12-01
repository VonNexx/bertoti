public class Usuario {
    private String nome;
    private String senha;
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean compararUsuario(Usuario user){
        if(nome.equals(user.getNome())
        && senha.equals(user.getSenha())){
            return true;
        } else {
            return false;
        }
    }
}
