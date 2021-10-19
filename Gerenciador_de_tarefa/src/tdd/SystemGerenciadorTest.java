package tdd;
import static org.junit.Assert.*;
import org.junit.Test;
import system.SystemGerenciador;
import system.Projeto;
/*******************************************************************************
Autor: Alisson Bomfim da Silva e Alexandre Silva CaribÈ
Componente Curricular: Algoritmos e ProgramaÁ„o II
Concluido em: 14/10/2011
Declaro que este c√≥digo foi elaborado por mim de forma individual e n√£o cont√©m nenhum
trecho de c√≥digo de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e p√°ginas ou documentos eletr√¥nicos da Internet. Qualquer trecho de c√≥digo
de outra autoria que n√£o a minha est√° destacado com uma cita√ß√£o para o autor e a fonte
do c√≥digo, e estou ciente que estes trechos n√£o ser√£o considerados para fins de avalia√ß√£o.
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
	 * Teste de unidade que verifica se a criaÁ„o de um Projeto ocorreu com sucesso
	 */
	@Test
	public void criarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		Projeto a = (Projeto)sys.getProjetos().getInicio().getData();
		assertEquals(a,sys.buscarPeloTitulo("projeto x"));
	}
	
	/**
	 * Teste de unidade que verifica se o mÈtodo de busca de um Projeto ocorreu com sucesso
	 */
	@Test
	public void buscarPeloTituloTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		assertEquals("projeto x", sys.buscarPeloTitulo("projeto x").getTitulo());
	}
	/**
	 * Teste de unidade que verifica se a ediÁ„o dos parametros de um Projeto ocorreu com sucesso
	 */
	@Test
	public void editarProjetoTest() {
		sys = new SystemGerenciador();
		sys.criarProjeto("projeto x", "desenvolvimento do projeto x");
		sys.editarProjeto("projeto x", "projetox","desenvolvimento do projeto x");
		assertEquals(sys.getProjetos().getInicio().getData(),sys.buscarPeloTitulo("projetox"));
	}
	
	/**
	 * Teste de unidade que verifica se a exclus„o de um Projeto ocorreu com sucesso
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