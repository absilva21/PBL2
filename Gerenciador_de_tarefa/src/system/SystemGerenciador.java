package system;
import colections.LinkList;


public class SystemGerenciador {
	LinkList<Projeto> projetos;

	public LinkList<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(LinkList<Projeto> projetos) {
		this.projetos = projetos;
	}
	
}
