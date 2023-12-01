import java.util.LinkedList;
import java.util.List;

public class Loja {
    public static Jogo[] getJogos;
    private List<Jogo> jogos = new LinkedList<Jogo>();
    private List<Usuario> usuarios = new LinkedList<Usuario>();

    // Gets e Sets
    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    //Fim Gets e Sets

    public void addJogo (Jogo jogo) {
        jogos.add(jogo);
    }

    public void addUsuario (Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Jogo> buscarJogoNome (String nome) {
        List<Jogo> encontrados = new LinkedList<Jogo>();
        for (Jogo jogo:jogos) {
            if (jogo.getNome().equals(nome)) {
                encontrados.add(jogo);
            }
        }
        return encontrados;
    }

    public List<Jogo> buscarJogoEspecificacao (Especificacao espec) {
        List<Jogo> encontrados = new LinkedList<Jogo>();
        for (Jogo jogo:jogos) {
            if (jogo.getEspec().equals(espec)) {
                encontrados.add(jogo);
            }
        }
        return encontrados;
    }

    public List<Jogo> buscarJogoPreço (Double preço) {
        List<Jogo> encontrados = new LinkedList<Jogo>();
        for (Jogo jogo:jogos) {
            if (jogo.getPreço() == (preço)) {
                encontrados.add(jogo);
            }
        }
        return encontrados;
    }
} 
