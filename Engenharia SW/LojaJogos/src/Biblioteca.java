import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<Jogo> jogosComprados = new LinkedList<Jogo>();

    public void comprarJogo (Jogo jogos){
        for (Jogo jogo : Loja.getJogos){
            if (jogo.getPreço() == 0){
                jogosComprados.add(jogo);
            }
        }
    }

    public List<Jogo> getJogosComprados() {
        return jogosComprados;
    }

    public void setJogosComprados(List<Jogo> jogosComprados) {
        this.jogosComprados = jogosComprados;
    }
}
