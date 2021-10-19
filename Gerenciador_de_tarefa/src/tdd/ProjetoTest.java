package tdd;
import static org.junit.Assert.*;
import system.Projeto;
import system.Tarefa;
import java.util.GregorianCalendar;
import org.junit.Before;
import org.junit.Test;

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
 * Testes de unidade para a classe {@link Projeto}
 */

public class ProjetoTest {
	Projeto a;
	Tarefa x1;
	/**
     * Este método é executado antes de cada teste de unidade (testes a seguir), 
     * e serve para inicializar objetos que são utilizados nos testes.
     */
    @Before
    public void setUp() throws Exception {
    	a = new Projeto("Projeto x","criar algo");
    	x1 = new Tarefa("fazer classe x","implentar a classe x", new GregorianCalendar(2021,9,14,19,0)); 
    }
	
	
	/**
     * Teste de unidade que verifica se a tarefa foi adicionada com sucesso
     */
	@Test
	public void  addTarefaTest() {
		a.addTarefa(x1);
		assertEquals(x1,a.getTarefas().getInicio().getData());
	}	
	
	/** 
	 * Teste de unidade que verifica se a tarefa foi excluida com sucesso
	 */
	@Test
	public void excluirTarefaTest() {
		a.addTarefa(x1);
		a.excluirTarefa("fazer classe x");
		assertTrue(a.getTarefas().isEmpty());
	}
	/**
	 * Teste de unidade que verifica se a tarefa foi editada corretamente
	 */
	@Test
	public void editarTarefaTest() {
		a.addTarefa(x1);
		a.editarTarefa("fazer classe x","fsd vlsdr x","implementar a classe x",new GregorianCalendar(2021,9,14,19,0),"Pendente");
		assertEquals(a.buscarPeloTitulo("fsd vlsdr x"),x1);
	}
	
	/**
	 * Teste de unidade que verifica se a busca pelo titulo da tarefa foi concluida com sucesso
	 */
	@Test
	public void buscarPeloTituloTest() {
		a.addTarefa(x1);
		assertEquals(a.buscarPeloTitulo("fazer classe x"),x1);
	}

}
