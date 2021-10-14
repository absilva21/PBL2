package system;
import java.util.Date;
import java.util.GregorianCalendar;
import colections.LinkList;
public class Projeto {
	private LinkList<Tarefa> tarefas;
	private String descricao;
	private String titulo;
	
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
	
	public void addTarefa(String title, String descri, GregorianCalendar data) {
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
	
	public boolean editarTarefa(String title,String newtitle,String newDescri,GregorianCalendar newPrevi, String newSitua) {
		Tarefa a = this.BuscarPeloTitulo(title);
		
		if(a!=null) {
			a.setDescricao(newDescri);
			a.setPrevisao(newPrevi);
			a.setTitulo(newtitle);
			a.setSituacao(newSitua);
			
		}
		return a!=null;
	}
	
	public void excluirtarefa(String title) {
		int posi = 0;
		tarefas.resetIndex();
		Tarefa a = (Tarefa) tarefas.next();
		
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
