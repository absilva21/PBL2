package tdd;

import static org.junit.Assert.*;
import system.Projeto;
import system.Tarefa;
import java.util.Date;
import org.junit.Test;

public class ProjetoTest {
	Projeto a = Projeto("Projeto x","criar algo");
	Tarefa x1 = new Tarefa("fazer classe x","implentar a classe x", new Date()); 

	/**
	 * Testa se a tarefa foi adicionada com sucesso
	 */
	@Test
	public void  addTarefaTest() {
		a.addTarefa(x1);
		assertEquals(x1,a.getTarefas().getInicio().getData());
	}	
	
	/**
	 * testa se a tarefa foi excluida com sucesso
	 */
	@Test
	public void excluirTarefaTest() {
		a.excluirTarefa("fazer classe x");
		assertTrue(a.getTarefas().isEmpty());
	}
	/**
	 * Testa a alteração dos dados de uma tarefa
	 */
	@Test
	public void editarTarefaTest() {
		a.editarTarefa("fazer classe x","fsd vlsdr x","implementar a classe x", 121425152);
		AssertEquals(a.buscarPeloTitulo("fsd vlsdr x"),x1);
	}
	
	/**
	 * Testa a busca pelo titulo da tarefa
	 */
	@Test
	public void buscarPeloTituloTest() {
		AssetEquals(a.buscarPeloTitulo("fazer classe x"),x1);
	}

}
