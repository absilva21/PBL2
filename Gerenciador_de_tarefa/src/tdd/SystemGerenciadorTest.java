package tdd;

import static org.junit.Assert.*;
import org.junit.Test;
import system.SystemGerenciador;
import system.Projeto;

public class SystemGerenciadorTest {
	
	SystemGerenciador sys;
	
	@Test
	public void criarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		Projeto a = (Projeto)sys.getProjetos().getInicio().getData();
		assertEquals(a,sys.buscarPeloTitulo("projeto x"));
	}

}
