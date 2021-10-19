package system;
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
 * A classe SystemDataHora È respons·vel pela verificaÁ„o de tempo do Gerenciador para com a situaÁ„o das Tarefas
 * @author alisson
 * @author Alexandre
 */
import java.util.TimerTask;
import java.util.GregorianCalendar;
import colections.LinkList;

public class SystemDataHora extends TimerTask {
	
	GregorianCalendar clock;		//Vari·vel relacionada ao tempo
	LinkList<Tarefa> observers;		//Lista de Tarefas a ser verificada
	
	/**
	 * Construtor da Classe SystemDataHora
	 */
	public SystemDataHora() {
		observers = new LinkList<Tarefa>();
	}
	/**
	 * MÈtodo que devolve a Lista de Tarefas a serem verificadas
	 * @return observers, uma Lista de Tarefas que ser„o verificadas
	 */
	public LinkList<Tarefa> getObservers() {
		return observers;
	}
	/**
	 * MÈtodo que altera/seta Lista a ser verificada
	 * @param observers, do tipo LinkList<Tarefa> e se refere a lista a ser verificada
	 */
	public void setObservers(LinkList<Tarefa> observers) {
		this.observers = observers;
	}

	
	
	@Override
	public void run() {
		
		while(true) {
			clock = new GregorianCalendar();
			observers.resetIndex();
			Tarefa a = (Tarefa)observers.next();
			while(observers.getIndex()!=null) {
				GregorianCalendar data = a.getPrevisao();
				if(clock.after(data)) {
					a.marcarPendente();
				}
				a = observers.next();
			}
		}
	}
	/**
	 * MÈtodo que devolve o tempo
	 * @return clock, vari·vel relacionada ao tempo
	 */
	public GregorianCalendar getClock() {
		return clock;
	}
	/**
	 * MÈtodo que altera/seta o tempo
	 * @param clock, do tipo GregorianCalendar e se refere ao tempo
	 */
	public void setClock(GregorianCalendar clock) {
		this.clock = clock;
	}
	/**
	 * MÈtodo que adiciona a Tarefa na Lista de tarefas a serem observadas pela classe SystemDataHora
	 * @param observer, do tipo Tarefa
	 */
	public void add(Tarefa observer) {
		observers.add(observer);
	}
	/**
	 * MÈtodo que remove a Tarefa da lista de observaÁ„o da Lista
	 * @param title, do tipo String que se refere ao titulo da Tarefa
	 */
	public void remove(String title) {
		int posi = 0;
		observers.resetIndex();
		Tarefa a = (Tarefa) observers.next();
		
		while(observers.getIndex()!=null) {
			if(a.getTitulo().equals(title)){
				observers.remove(posi);
				break;
			}else {
				posi++;
				a = observers.next();
			}
			
		}
	}
}