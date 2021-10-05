package tdd;

import static org.junit.Assert.*;
import system.Projeto;
import system.Tarefa;
import java.util.Date;
import org.junit.Test;

public class ProjetoTest {
	Projeto a = Projeto("Projeto x","criar algo");
	@Test
	public void  addTarefaTest() {
		Tarefa x1 = new Tarefa("fazer classe x","implentar a classe x", new Date()); 
		a.addTarefa(x1);
		assertEquals(x1,a.getTarefas().getInicio().getData());
	}

}
