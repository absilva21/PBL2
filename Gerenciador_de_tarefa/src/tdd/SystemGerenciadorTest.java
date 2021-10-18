package tdd;

import static org.junit.Assert.*;
import org.junit.Test;
import system.SystemGerenciador;
import system.Projeto;

public class SystemGerenciadorTest {
	
	SystemGerenciador sys;
	/**
	 * testa a criação de um Projeto
	 */
	@Test
	public void criarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		Projeto a = (Projeto)sys.getProjetos().getInicio().getData();
		assertEquals(a,sys.buscarPeloTitulo("projeto x"));
	}
	
	/**
	 * Testa o método de busca 
	 */
	@Test
	public void buscarPeloTituloTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		assertEquals("projeto x", sys.buscarPeloTitulo("projeto x").getTitulo());
	}
	/**
	 * testa a edição dos parâmetros de um Projeto
	 */
	@Test
	public void editarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		sys.editarProjeto("projeto x", "projetox","desenvolvimento do projeto x");
		assertEquals(sys.getProjetos().getInicio().getData(),sys.buscarPeloTitulo("projetox"));
	}
	
	/**
	 * testa a exclusão  de um Projeto da Lista
	 */
	@Test
	public void apagarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		assertEquals("projeto x", sys.buscarPeloTitulo("projeto x").getTitulo());
		sys.apagarProjeto("projeto x");
		assertTrue(sys.getProjetos().isEmpty());
	}
	

}
