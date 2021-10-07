package system;
import java.util.Date;

import colections.LinkList;
public class Projeto {
	private LinkList<Tarefa> tarefas;
	private String descricao;
	private String titulo;
	
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
	
	public void addTarefa(String title, String descri, Date data) {
		Tarefa n = new Tarefa(title,descri,data);
		tarefas.add(n);
	}
	
	public Tarefa BuscarPeloTitulo(String titl) {
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
	
	public void excluirtarefa(String title) {
		
	}
	
	
}
