package system;
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
 * A classe SystemDataHora é responsável pela verificação de tempo do Gerenciador para com a situação das Tarefas
 * @author alisson
 * @author Alexandre
 */
import java.util.TimerTask;
import java.util.GregorianCalendar;
import colections.LinkList;

public class SystemDataHora extends TimerTask {
	
	GregorianCalendar clock;		//Vari�vel relacionada ao tempo
	LinkList<Tarefa> observers;		//Lista de Tarefas a ser verificada
	
	/**
	 * Construtor da Classe SystemDataHora
	 */
	public SystemDataHora() {
		observers = new LinkList<Tarefa>();
	}
	/**
	 * Método que devolve a Lista de Tarefas a serem verificadas
	 * @return observers, uma Lista de Tarefas que serão verificadas
	 */
	public LinkList<Tarefa> getObservers() {
		return observers;
	}
	/**
	 * Método que altera/seta Lista a ser verificada
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
	 * Método que devolve o tempo
	 * @return clock, variável relacionada ao tempo
	 */
	public GregorianCalendar getClock() {
		return clock;
	}
	/**
	 * Método que altera/seta o tempo
	 * @param clock, do tipo GregorianCalendar e se refere ao tempo
	 */
	public void setClock(GregorianCalendar clock) {
		this.clock = clock;
	}
	/**
	 * Método que adiciona a Tarefa na Lista de tarefas a serem observadas pela classe SystemDataHora
	 * @param observer, do tipo Tarefa
	 */
	public void add(Tarefa observer) {
		observers.add(observer);
	}
	/**
	 * Método que remove a Tarefa da lista de observação da Lista
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