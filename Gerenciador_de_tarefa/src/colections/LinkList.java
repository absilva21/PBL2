package colections;
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
 * A classe LinkList<T> é uma Lista Genérica que implementa Iterator
 * @author alisson
 * @author Alexandre
 */
import java.util.Iterator;

public class LinkList<T> implements Iterator{
	private Link inicio;	//Nó cabeça da Lista Genérica
	private int size;		//Variável que indica o tamanho da lista
	Link index;				//Nó responsável pelo index da lista
	
	/**
     * Retorna o tamanho da lista.
     * @return tamanho da lista.
     */
	public int getSize() {
		return size;
	}
	/**
     * Retorna o nó index da lista.
     * @return index, nó da lista.
     */
	public Link getIndex() {
		return index;
	}
	/**
     * Seta o nó index da lista.
     */
	public void setIndex(Link current) {
		this.index = current;
	}
	/**
     * Reseta o nó index da lista.
     */
	public void resetIndex() {
		if(isEmpty()) {
			this.index = null;
		}else {
			this.index = this.inicio;
		}
		
	}
	/**
     * Mótodo que verifica se existe próximo nó e retorna um booleano
     * @return um booleano, True caso tenha um próximo nó e False caso não tenha
     */
	public boolean hasNext(){
		return this.index!=null;
	}
	/**
     * Método que retorna um tipo T da Lista
     * @return T, um tipo de dado genérico da Lista que foi criada
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
     * Retorna o nó inicio da lista (nó cabeça).
     * @return inicio, nó cabeça da lista.
     */
	public Link getInicio() {
		return inicio;
	}
	/**
     * Indica se a lista está vazia.
     * @return True caso o nó cabeça seja igual a null o que significa que a lista está vazia,
     * False caso contrário
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
     * Retorna o objeto em uma determinada posição da lista, sem remove-lo.
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
     * Remove o primeiro nó da Lista, deslocando demais elementos seguintes para esquerda.
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
     * Remove um nó de uma determinada posição, deslocando demais elementos seguintes para esquerda.
     * @param index, a posição do nó a ser removido.
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
	 * Exibe a Lista caso não esteja vazia
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
