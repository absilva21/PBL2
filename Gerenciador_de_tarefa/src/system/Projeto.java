package system;

import java.util.GregorianCalendar;
import colections.LinkList;
public class Projeto {
	private LinkList<Tarefa> tarefas;
	private String descricao;
	private String titulo;
	
	/**
	 * Inicializa o titulo e a descrição do Projeto
	 * @param titul
	 * @param descrica
	 */
	public Projeto(String titul, String descrica){
		titulo = titul;
		descricao = descrica;
		tarefas = new <Tarefa>LinkList();
	}
	
	public LinkList<Tarefa> getTarefas() {
		return tarefas;
	}
	public void setTarefas(LinkList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * adiciona uma nova tarefa no projeto
	 * @param nova
	 */
	public void addTarefa(Tarefa nova) {
		
		tarefas.add(nova);
	}
	
	/**
	 * faz um Iterator e encontra uma tarefa na LinkList 
	 * pelo título.
	 * @param titl
	 * @return
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
	 * busca uma tarefa pelo título e edita seus parâmetros
	 * @param title
	 * @param newtitle
	 * @param newDescri
	 * @param newPrevi
	 * @param newSitua
	 * @return
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
	 * exclui uma Tarefa pelo título
	 * @param title
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
