package system;
import colections.LinkList;


public class SystemGerenciador {
	LinkList<Projeto> projetos;
	
	public SystemGerenciador() {
		projetos = new <Projeto>LinkList();
	}

	public LinkList<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(LinkList<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	
	public void criarProjeto(String titu, String descri) {
		Projeto n = new Projeto(titu,descri);
		projetos.add(n);
	}
	
	public Projeto buscarPeloTitulo(String title) {
		projetos.resetIndex();
		Projeto a = (Projeto) projetos.next();
		Projeto b = null;
		if(a.getTitulo().equals(title)){
			b = a; 
		}
		while(projetos.getIndex()!=null) {
			if(a.getTitulo().equals(title)){
				b = a;
				break;
			}else {
				a = projetos.next();
			}
			
		}
		return b;
	}
	
	public boolean editarProjeto(String title, String newTitle,String newDescicao) {
		Projeto a = this.buscarPeloTitulo(title);
		
	
		if(a!=null) {
			a.setTitulo(newTitle);
			a.setDescricao(newDescicao);
		}
		
		return a!=null;
		
	}
	
	public void apagarProjeto(String title) {
		int posi = 0;
		projetos.resetIndex();
		Projeto a = (Projeto) projetos.next();
		
		while(projetos.getIndex()!=null) {
			if(a.getTitulo().equals(title)){
				projetos.remove(posi);
				break;
			}else {
				posi++;
				a = projetos.next();
			}
			
		}
	}
}
