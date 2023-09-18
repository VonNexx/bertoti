import static org.junit.Assert.assertEquals;

public class Teste {
    
    @org.junit.jupiter.api.Test
    void Test() {
        Loja loja = new Loja();

        Especificacao valorantEspec = new Especificacao("Riot", "Riot", "FPS");
        Especificacao leagueOfLegendsEspec = new Especificacao("Riot", "Riot", "MOBA");
        Especificacao csGoEspec = new Especificacao("Valve", "Valve", "FPS");

        Jogo valorantJogo = new Jogo("Valorant", valorantEspec, 0);
        Jogo leagueOfLegendsJogo = new Jogo("League of Legends", leagueOfLegendsEspec, 0);
        Jogo csGoJogo = new Jogo("CsGo", csGoEspec, 0);

        Usuario vonNexxUsuario = new Usuario("Von Nexx", "12345");

        loja.addUsuario(vonNexxUsuario);

        loja.addJogo(valorantJogo);
        loja.addJogo(leagueOfLegendsJogo);
        loja.addJogo(csGoJogo);

        assertEquals(loja.getUsuarios().size(), 1);

        assertEquals(loja.getJogos().size(), 3);

        assertEquals(loja.buscarJogoNome("Valorant").get(0), valorantJogo);
        assertEquals(loja.buscarJogoNome("CsGo").get(0), csGoJogo);

        assertEquals(loja.buscarJogoEspecificacao(csGoEspec).get(0), csGoJogo);
    }

}