package system;
import colections.LinkList;
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
 * A classe SystemGerenciador È o sistema do gerenciador
 * @author alisson
 * @author Alexandre
 */

public class SystemGerenciador {
	LinkList<Projeto> projetos;							//Lista do tipo Projeto que contÈm todos os Projetos de um 
	SystemDataHora sysClock = new SystemDataHora(); 	//Instancia da Classe SystemDataHora
	
	/**
	 * MÈtodo que devolve a instancia 
	 * @return sysClock, a instancia da  Classe SystemDataHora
	 */
	public SystemDataHora getSysClock() {
		return sysClock;
	}
	/**
	 * MÈtodo que altera/seta a instancia da  Classe SystemDataHora
	 * @param sysClock, È do tipo SystemDataHora que representa a Data e Hora do Projeto
	 */
	public void setSysClock(SystemDataHora sysClock) {
		this.sysClock = sysClock;
	}
	/**
	 * Construtor da Classe SystemGerenciador
	 */
	public SystemGerenciador() {
		projetos = new LinkList<Projeto>();
	}
	/**
	 * MÈtodo que devolve a Lista de Projetos
	 * @return projetos, uma Lista do tipo Projeto de projetos criados pelo usu·rio
	 */
	public LinkList<Projeto> getProjetos() {
		return projetos;
	}
	/**
	 * MÈtodo que altera/seta a Lista de Projetos
	 * @param projetos, È do tipo Projeto que representa a lista de projetos criados pelo usu·rio
	 */
	public void setProjetos(LinkList<Projeto> projetos) {
		this.projetos = projetos;
	}
	/**
	 * MÈtodo que cria um novo projeto no Gerenciador
	 * @param titu, uma String que se refere ao titulo do projeto
	 * @param descri, uma String que se refere a descriÁ„o do projeto
	 */
	public void criarProjeto(String titu, String descri) {
		Projeto n = new Projeto(titu,descri);
		projetos.add(n);
	}
	/**
	 * MÈtodo que faz a busca pelo titulo de um Projeto
	 * @param title, uma String que se refere ao titulo do projeto
	 * @return b, uma instancia do Projeto com o titulo que o usu·rio est· buscando
	 */
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
	/**
	 * MÈtodo que faz a ediÁ„o do projeto, substituindo o titulo e a descriÁ„o
	 * @param title, uma String que se refere ao titulo atual do projeto
	 * @param newTitle, uma String que se refere ao novo titulo do projeto
	 * @param newDescicao, uma String que se refere a nova descriÁ„o do projeto
	 * @return a, uma instancia de Projeto que È justamente o nÛ onde ocorreu a ediÁ„o
	 */
	public boolean editarProjeto(String title, String newTitle,String newDescicao) {
		Projeto a = this.buscarPeloTitulo(title);
		
	
		if(a!=null) {
			a.setTitulo(newTitle);
			a.setDescricao(newDescicao);
		}
		
		return a!=null;
		
	}
	/**
	 * MÈtodo que faz a busca de um projeto pelo titulo e que deleta ele da Lista
	 * @param title, uma String que se refere ao titulo do projeto
	 */
	public void apagarProjeto(String title) {
		int posi = 0;
		projetos.resetIndex();
		Projeto a = (Projeto) projetos.next();
		if(a.getTitulo().equals(title)){
			projetos.remove(posi);
		}
		
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
