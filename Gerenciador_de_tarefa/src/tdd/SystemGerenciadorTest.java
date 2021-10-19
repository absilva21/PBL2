package tdd;
import static org.junit.Assert.*;
import org.junit.Test;
import system.SystemGerenciador;
import system.Projeto;
/*******************************************************************************
Autor: Alisson Bomfim da Silva e Alexandre Silva Caribé
Componente Curricular: Algoritmos e Programação II
Concluido em: 14/10/2011
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
/**
 * @author alisson
 * @author Alexandre
 */
/**
 * Testes de unidade para a classe {@link SystemGerenciador}
 */

public class SystemGerenciadorTest {
	
	SystemGerenciador sys;
	/**
	 * Teste de unidade que verifica se a crição de um Projeto ocorreu com sucesso
	 */
	@Test
	public void criarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		Projeto a = (Projeto)sys.getProjetos().getInicio().getData();
		assertEquals(a,sys.buscarPeloTitulo("projeto x"));
	}
	
	/**
	 * Teste de unidade que verifica se o método de busca de um Projeto ocorreu com sucesso
	 */
	@Test
	public void buscarPeloTituloTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		assertEquals("projeto x", sys.buscarPeloTitulo("projeto x").getTitulo());
	}
	/**
	 * Teste de unidade que verifica se a edição dos parametros de um Projeto ocorreu com sucesso
	 */
	@Test
	public void editarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		sys.editarProjeto("projeto x", "projetox","desenvolvimento do projeto x");
		assertEquals(sys.getProjetos().getInicio().getData(),sys.buscarPeloTitulo("projetox"));
	}
	
	/**
	 * Teste de unidade que verifica se a exclusão de um Projeto ocorreu com sucesso
	 * testa a 
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