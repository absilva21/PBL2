package colections;
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
 * A classe LinkList<T> � uma Lista Gen�rica que implementa Iterator
 * @author alisson
 * @author Alexandre
 */
import java.util.Iterator;

public class LinkList<T> implements Iterator{
	private Link inicio;	//N� cabe�a da Lista Gen�rica
	private int size;		//Vari�vel que indica o tamanho da lista
	Link index;				//N� respons�vel pelo index da lista
	
	/**
     * Retorna o tamanho da lista.
     * @return tamanho da lista.
     */
	public int getSize() {
		return size;
	}
	/**
     * Retorna o n� index da lista.
     * @return index, n� da lista.
     */
	public Link getIndex() {
		return index;
	}
	/**
     * Seta o n� index da lista.
     */
	public void setIndex(Link current) {
		this.index = current;
	}
	/**
     * Reseta o n� index da lista.
     */
	public void resetIndex() {
		if(isEmpty()) {
			this.index = null;
		}else {
			this.index = this.inicio;
		}
		
	}
	/**
     * M�todo que verifica se existe pr�ximo n� e retorna um booleano
     * @return um booleano, True caso tenha um pr�ximo n� e False caso n�o tenha
     */
	public boolean hasNext(){
		return this.index!=null;
	}
	/**
     * M�todo que retorna um tipo T da Lista
     * @return T, um tipo de dado gen�rico da Lista que foi criada
     */
	public T next() {
		Link data;
		if(this.index==this.inicio&&this.inicio!=null) {
			data = this.index;
			this.index = index.getProximo();
			
		}else if(this.inicio!=null&&this.index==this.inicio.getProximo()) {
			data = this.index;
			this.index = index.getProximo();
		}else if(this.index!=null&&this.index.getProximo()==null) {
			data = this.index;
			this.index = null;
		}else if(this.getInicio()==null) {
			return null;
		}else {
			this.index = index.getProximo();
			data = this.index;
		}
		
		return (T) data.getData();
	}
	/**
	 * Construtor da classe LinkList
	 * Inicia o tamanho como 0 e o index recebe o mesmo do inicio
	 */
	public LinkList() {
		this.size = 0;
		this.index = this.inicio;
	}
	/**
     * Retorna o n� inicio da lista (n� cabe�a).
     * @return inicio, n� cabe�a da lista.
     */
	public Link getInicio() {
		return inicio;
	}
	/**
     * Indica se a lista est� vazia.
     * @return True caso o n� cabe�a seja igual a null o que significa que a lista est� vazia,
     * False caso contr�rio
     */
	public boolean isEmpty() {
		return this.inicio == null;
	}
	/**
     * Insere um objeto ao final da lista.
     * @param Object data, a ser inserido ao final da lista.
     */
	public void inserir(Object data) {
		Link novo = new Link(data);
		Link aux;
		if(this.isEmpty()) {
			this.inicio = novo;
		}else {
			aux = this.inicio;
			this.inicio = novo;
			this.inicio.setProximo(aux);
		}
		size++;
		
	}
	/**
     * Retorna o objeto em uma determinada posi��o da lista, sem remove-lo.
     * @param index, do objeto a ser recuperado.
     * @return o objeto a ser recuperado ou null caso a lista esteja vazia
     */
	public Object get(int index) {
		Link current = this.inicio;
		int cont = 0;
		while(cont != index) {
			if(current == null) {
				return null;
			}
			current = current.getProximo();
			cont++;
		}
		return current.getData();
	}
	/**
     * Insere um objeto ao final da lista.
     * @param Object data, a ser inserido ao final da lista.
     */
	public void add(Object data) {
		Link current = this.inicio;
		Link anterior = null;
		Link novo = new Link(data);
		if(this.isEmpty()) {
			this.inicio = novo;
		}else {
			while(current!=null) {
				anterior = current;
				current = current.getProximo();
				
			}
			anterior.setProximo(novo);
			novo.setProximo(current);
			
		}
		this.index=this.inicio;
		size++;
	}
	
	/**
     * Remove o primeiro n� da Lista, deslocando demais elementos seguintes para esquerda.
     */
	public void remove() {
		Link current = null;
		Link aux = null;
		if(!this.isEmpty()){
			current = this.inicio;
			aux = current;
			this.inicio = current.getProximo();
			size--;
		}
	}
	/**
     * Remove um n� de uma determinada posi��o, deslocando demais elementos seguintes para esquerda.
     * @param index, a posi��o do n� a ser removido.
     */
	public void remove(int inde) {
		Link currenta = this.inicio;
		Link anterior = this.inicio;
		int cont = 0;
		while(cont != inde) {
			if(currenta == null) {
				break;
			}
			anterior = currenta;
			currenta = currenta.getProximo();
			cont++;
		}
		
		if(currenta==inicio) {
			inicio= inicio.getProximo();
			size--;
		}else {
			anterior.setProximo(currenta.getProximo());
			size--;
		}

		
	}
	/**
	 * Exibe a Lista caso n�o esteja vazia
	 */
	public void show() {
		Link current = this.inicio;
		if(this.isEmpty()) {
			System.out.println("A lista est� vazia!");
		}else {
			while(current!=null) {
				System.out.println(current.getData());
				current = current.getProximo();
			}
		}
	}
}
