/**
 * 
 */
package tdd;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import system.Tarefa;
/**
 * @author alisson
 *
 */
public class TarefaTest {
	
	Tarefa a = new Tarefa("Fazer classe 'x'","Criar a classe x com antecedencia",new Date());
	/**
	 * @throws java.lang.Exception
	 */

	@Test
	public void marcarPendenteTeste() {
		assertEquals("Pendente",a.getSituacao());
	}
	
	@Test
	public void marcarEmExecTest() {
		a.marcarExecucao();
		assertEquals("Em execução",a.getSituacao());
	}
	
	@Test
	public void marcarFinalizadaTest() {
		a.marcarFinalizada();
		assertEquals("Finalizada",a.getSituacao());
		
	}
	
	@Test
	public void updateTest() {
		SystemHoraData sys = SystemHoraData();
		sys.add(a);
		assertEquals("Pendente",a.getSituacao());
		
	}

}
