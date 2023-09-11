import java.util.LinkedList;
import java.util.List;


public class Loja {
    private List<Jogo> jogos = new LinkedList<Jogo>();
    private List<Usuario> usuarios;

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

    public List<Jogo> buscarJogoEspecificacao (Especicacao espec) {
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
