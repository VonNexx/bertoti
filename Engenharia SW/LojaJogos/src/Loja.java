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

    public List<Jogo> getJogoNome (String nome) {
        List<Jogo> encontrados = new LinkedList<Jogo>();
        for (Jogo jogo:jogos) {
            if (jogo.getNome().equals(nome)) {
                encontrados.add(jogo);
            }
        }
        return encontrados;
    }
}
