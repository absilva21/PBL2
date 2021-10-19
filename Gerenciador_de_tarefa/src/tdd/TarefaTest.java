package tdd;
import static org.junit.Assert.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import system.Tarefa;
import system.Projeto;
import system.SystemDataHora;
import java.util.GregorianCalendar;
/*******************************************************************************
Autor: Alisson Bomfim da Silva e Alexandre Silva Carib�
Componente Curricular: Algoritmos e Programa��o II
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
 * Testes de unidade para a classe {@link Tarefa}
 */
public class TarefaTest {
	Tarefa a ;
	/**
     * Este método é executado antes de cada teste de unidade (testes a seguir), 
     * e serve para inicializar objetos que são utilizados nos testes.
     */
    @Before
    public void setUp() throws Exception {
    	a = new Tarefa("Fazer classe 'x'","Criar a classe x com antecedencia",new GregorianCalendar());
    }
	/**
	 * Teste de unidade que verifica se a tarefa  foi marcada como "Pendente"
	 */
	@Test
	public void marcarPendenteTeste() {
		assertEquals("Pendente",a.getSituacao());
	}
	
	/**
	 * Teste de unidade que verifica se a tarefa  foi marcada como "Em execução"
	 */
	@Test
	public void marcarEmExecTest() {
		a.marcarExecucao();
		assertEquals("Em execu��o",a.getSituacao());
	}
	
	/**
	 * Teste de unidade que verifica se a tarefa  foi marcada como "Finalizada"
	 */
	@Test
	public void marcarFinalizadaTest() {
		a.marcarFinalizada();
		assertEquals("Finalizada",a.getSituacao());
		
	}
}