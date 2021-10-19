package system;
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
 * A classe Projeto define os projetos criados pelo usu�rio para acompanhar seu gerenciador
 * @author alisson
 * @author Alexandre
 */
import java.util.GregorianCalendar;
import colections.LinkList;
public class Projeto {
	private LinkList<Tarefa> tarefas;	//Lista do tipo Tarefa que cont�m as tarefas a serem criadas em determinado 
	private String descricao;			//Descri��o do Projeto a ser determinado pelo usu�rio
	private String titulo;				//Titulo do Projeto a ser determinado pelo usu�rio
	
	/**
	 * Construtor da Classe Projeto que inicializa o titulo, a descri��o do Projeto e a lista de tarefas.
	 * @param titul, String que representa o titulo do Projeto
	 * @param descrica, String que representa a descri��o do Projeto
	 */
	public Projeto(String titul, String descrica){
		titulo = titul;
		descricao = descrica;
		tarefas = new LinkList<Tarefa>();
	}
	/**
	 * M�todo que devolve a Lista de tarefas do Projeto
	 * @return tarefas, do tipo LinkList e se refere a uma lista de tarefas do Projeto
	 */
	public LinkList<Tarefa> getTarefas() {
		return tarefas;
	}
	/**
	 * M�todo que altera/seta a Lista de tarefas do Projeto
	 * @param tarefas, do tipo LinkList e se refere a uma lista de tarefas do Projeto a ser setada
	 */
	public void setTarefas(LinkList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	/**
	 * M�todo que devolve a descri��o do Projeto
	 * @return descricao, do tipo String e se refere a descri��o do Projeto
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * M�todo que altera/seta a descri��o do produto do Card�pio
	 * @param descrica, � do tipo String que representa a descri��o do Projeto
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * M�todo que devolve o Titulo do Projeto
	 * @return titulo, do tipo String e se refere ao titulo do Projeto
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * M�todo que altera/seta o Titulo do Projeto
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
	 * @param newDescri, do tipo String e se refere a nova descri��o do Projeto
	 * @param newPrevi, do tipo GregorianCalendar e se refere a nova data de previs�o do Projeto
	 * @param newSitua, do tipo String e se refere a nova situa��o do Projeto (Pendente, em execu��o ou finalizada)
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