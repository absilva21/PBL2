package colections;
/*******************************************************************************
Autor: Alison Bomfim da Silva
Componente Curricular: Algoritmos I
Concluido em: 14/10/2011
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
import java.util.Iterator;


public class LinkList<T> implements Iterator{
	private Link inicio;
	/**
	 * 
	 */
	int size;
	Link index;
	
	/**
	 * @return
	 */
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Link getIndex() {
		return index;
	}

	public void setIndex(Link current) {
		this.index = current;
	}

	public void resetIndex() {
		this.index = this.inicio;
	}
	
	public boolean hasNext(){
		return this.index!=null;
	}
	
	public T next() {
		Link data;
		if(this.index==this.inicio) {
			data = this.index;
			this.index = index.getProximo();
			
		}else if(this.index==this.inicio.getProximo()) {
			data = this.index;
			this.index = index.getProximo();
		}else if(this.index.getProximo()==null) {
			data = this.index;
			this.index = null;
		}else {
			this.index = index.getProximo();
			data = this.index;
		}
		
		return (T) data.getData();
	}
	
	public LinkList() {
		this.size = 0;
		this.index = this.inicio;
	}
	
	public Link getInicio() {
		return inicio;
	}

	public void setInicio(Link inicio) {
		this.inicio = inicio;
	}
	
	public boolean isEmpty() {
		return this.inicio == null;
	}
	
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
	
	public Object get(int index) {
		Link current = this.inicio;
		int cont = 0;
		while(cont != index) {
			if(current == null) {
				break;
			}
			current = current.getProximo();
			cont++;
		}
		return current.getData();
	}
	
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
	
	public int size() {
		return this.size;
	}
	
	public void show() {
		Link current = this.inicio;
		if(this.isEmpty()) {
			System.out.println("A lista está vazia");
		}else {
			while(current!=null) {
				System.out.println(current.getData());
				current = current.getProximo();
			}
		}
	}
}
