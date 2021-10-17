/**
 * 
 */
package tdd;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import system.Tarefa;
import system.SystemDataHora;
import java.util.GregorianCalendar;
/**
 * @author alisson
 *
 */
public class TarefaTest {
	
	
	Tarefa a = new Tarefa("Fazer classe 'x'","Criar a classe x com antecedencia",new GregorianCalendar());
	/**
	 * @throws java.lang.Exception
	 */

	/**
	 *  Testa se a tarefa foi marcada como pendete
	 */
	@Test
	public void marcarPendenteTeste() {
		assertEquals("Pendente",a.getSituacao());
	}
	
	/***
	 * Testa se a tarefa foi marca como "em execução"
	 */
	@Test
	public void marcarEmExecTest() {
		a.marcarExecucao();
		assertEquals("Em execução",a.getSituacao());
	}
	
	/***
	 * Testa se a tarefa foi marcada como finalida
	 */
	@Test
	public void marcarFinalizadaTest() {
		a.marcarFinalizada();
		assertEquals("Finalizada",a.getSituacao());
		
	}
	/**
	 * testa se a tarefa está pedendete após atraso
	 */
	@Test
	public void updateTest() {
		SystemHoraData sys = new SystemDataHora();
		sys.add(a);
		assertEquals("Pendente",a.getSituacao());
		
	}

}
