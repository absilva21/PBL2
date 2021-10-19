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
 * A classe Projeto define os projetos criados pelo usuário para acompanhar seu gerenciador
 * @author alisson
 * @author Alexandre
 */
import java.util.GregorianCalendar;
import colections.LinkList;
public class Projeto {
	private LinkList<Tarefa> tarefas;	//Lista do tipo Tarefa que contém as tarefas a serem criadas em determinado 
	private String descricao;			//Descrição do Projeto a ser determinado pelo usuário
	private String titulo;				//Titulo do Projeto a ser determinado pelo usuário
	
	/**
	 * Construtor da Classe Projeto que inicializa o titulo, a descrição do Projeto e a lista de tarefas.
	 * @param titul, String que representa o titulo do Projeto
	 * @param descrica, String que representa a descrição do Projeto
	 */
	public Projeto(String titul, String descrica){
		titulo = titul;
		descricao = descrica;
		tarefas = new LinkList<Tarefa>();
	}
	/**
	 * Método que devolve a Lista de tarefas do Projeto
	 * @return tarefas, do tipo LinkList e se refere a uma lista de tarefas do Projeto
	 */
	public LinkList<Tarefa> getTarefas() {
		return tarefas;
	}
	/**
	 * Método que altera/seta a Lista de tarefas do Projeto
	 * @param tarefas, do tipo LinkList e se refere a uma lista de tarefas do Projeto a ser setada
	 */
	public void setTarefas(LinkList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	/**
	 * Método que devolve a descrição do Projeto
	 * @return descricao, do tipo String e se refere a descrição do Projeto
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * 
	 * @param descrica, é do tipo String que representa a descriçãoo do Projeto
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * Método que devolve o Titulo do Projeto
	 * @return titulo, do tipo String e se refere ao titulo do Projeto
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Método que altera/seta o Titulo do Projeto
	 * @param titulo, do tipo String e se refere ao titulo do Projeto
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Adiciona uma nova tarefa no projeto
	 * @param nova, do tipo Tarefa
	 */
	public void addTarefa(Tarefa nova) {
		tarefas.add(nova);
	}
	
	/**
	 * Faz um Iterator e encontra uma tarefa na LinkList 
	 * pelo titulo.
	 * @param titl, do tipo String e se refere ao titulo do Projeto a ser encontrado
	 * @return b, uma tarefa do tipo Tarefa
	 */
	public Tarefa buscarPeloTitulo(String titl) {
		tarefas.resetIndex();
		Tarefa a = (Tarefa) tarefas.next();
		Tarefa b = null;
		if(a.getTitulo().equals(titl)){
			b = a; 
		}
		while(tarefas.getIndex()!=null) {
			if(a.getTitulo().equals(titl)){
				b = a;
				break;
			}else {
				a = tarefas.next();
			}
			
		}
		return b;
	}
	
	/**
	 * Busca uma tarefa pelo titulo e edita seus parametros
	 * @param title, do tipo String e se refere ao titulo do Projeto a ser encontrado
	 * @param newtitle, do tipo String e se refere ao novo titulo do Projeto
	 * @param newDescri, do tipo String e se refere a nova descriçãoo do Projeto
	 * @param newPrevi, do tipo GregorianCalendar e se refere a nova data de previsão do Projeto
	 * @param newSitua, do tipo String e se refere a nova situação do Projeto (Pendente, em execução ou finalizada)
	 * @return um booleano
	 */
	public boolean editarTarefa(String title,String newtitle,String newDescri,GregorianCalendar newPrevi, String newSitua) {
		Tarefa a = this.buscarPeloTitulo(title);
		
		if(a!=null) {
			a.setDescricao(newDescri);
			a.setPrevisao(newPrevi);
			a.setTitulo(newtitle);
			a.setSituacao(newSitua);
			
		}
		return a!=null;
	}
	/**
	 * Exclui uma Tarefa da lista de tarefas pelo titulo
	 * @param title, do tipo String e se refere ao titulo a ser buscado na lista
	 */
	public void excluirTarefa(String title) {
		int posi = 0;
		tarefas.resetIndex();
		Tarefa a = (Tarefa) tarefas.next();
		if(a.getTitulo().equals(title)){
			tarefas.remove(posi);
		}
		
		while(tarefas.getIndex()!=null) {
			if(a.getTitulo().equals(title)){
				tarefas.remove(posi);
				break;
			}else {
				posi++;
				a = tarefas.next();
			}
			
		}
	}
	
}