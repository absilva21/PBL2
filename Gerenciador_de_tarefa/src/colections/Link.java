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
 * A classe Link<T> define um tipo de no genérico que é utilizado pela lista
 * @author alisson
 * @author Alexandre
 */
public class Link<T> {
	private Object data;			//Variável de tipo Object que contém um valor do n�
	private Link<T> proximo;		//Variável que contém um link pro próximo nó
	/**
     * Metodo que retorna o valor do nó
     * @return data, um objeto do dado do nó
     */
	public Object getData() {
		return data;
	}
	/**
     * Metédo que altera/seta o dado do nó
     * @param Object data, é um objeto do dado do nó
     */
	public void setData(Object data) {
		this.data = data;
	}
	/**
     * Metédo que retorna o próximo nó
     * @return proximo um Link<T> que contém referÊncia pro próximo nó
     */
	public Link<T> getProximo() {
		return proximo;
	}
	/**
     * Metodo que altera/seta o próximo nó
     * @param proximo, um Link<T> que contém referência pro próximo né
     */
	public void setProximo(Link<T> proximo) {
		this.proximo = proximo;
	} 
	/**
     * Construtor de Link
     * @param data, é um objeto de dado do nó
     */
	public Link(Object data){
		this.data = data;
	}
	
}