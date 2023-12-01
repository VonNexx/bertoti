import static org.junit.Assert.assertEquals;

public class Teste {
    
    @org.junit.jupiter.api.Test
    void Test() {
        Loja loja = new Loja();

        Especificacao valorantEspec = new Especificacao("Riot", "Riot", "FPS");
        Especificacao leagueOfLegendsEspec = new Especificacao("Riot", "Riot", "MOBA");
        Especificacao csGoEspec = new Especificacao("Valve", "Valve", "FPS");
        Especificacao terrariaEspec = new Especificacao("Logic", "Logic", "Survival");

        Jogo valorantJogo = new Jogo("Valorant", valorantEspec, 0);
        Jogo leagueOfLegendsJogo = new Jogo("League of Legends", leagueOfLegendsEspec, 0);
        Jogo csGoJogo = new Jogo("CsGo", csGoEspec, 0);
        Jogo terrariaJogo = new Jogo("Terraria", terrariaEspec, 20.0);

        Usuario user = new Usuario("User", "12345");
        Usuario usuario = new Usuario("Usuario", "678910");

        loja.addUsuario(user);
        loja.addUsuario(usuario);
        
        Biblioteca biblioteca = new Biblioteca();

        loja.addJogo(valorantJogo);
        loja.addJogo(leagueOfLegendsJogo);
        loja.addJogo(csGoJogo);
        loja.addJogo(terrariaJogo);

        assertEquals(user.compararUsuario(user), true);

        assertEquals(loja.getUsuarios().size(), 2);

        assertEquals(loja.getJogos().size(), 4);

        // assertEquals(user.getNome(), "User");
        // assertEquals(user.getSenha(), "12345");
        // assertEquals(user.getNome(), "Usuario");
        // assertEquals(user.getSenha(), "54321");

        assertEquals(loja.buscarJogoNome("Valorant").get(0), valorantJogo);
        assertEquals(loja.buscarJogoNome("CsGo").get(0), csGoJogo);
        assertEquals(loja.buscarJogoPreço(20.0).get(0), terrariaJogo);

        assertEquals(loja.buscarJogoEspecificacao(csGoEspec).get(0), csGoJogo);

        //biblioteca.comprarJogo(valorantJogo);

        //assertEquals(biblioteca.getJogosComprados(), 1);
    }
}