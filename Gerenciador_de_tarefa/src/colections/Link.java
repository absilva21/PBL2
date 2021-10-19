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
 * A classe Link<T> define um tipo de n� gen�rico que � utilizado pela lista
 * @author alisson
 * @author Alexandre
 */
public class Link<T> {
	private Object data;			//Vari�vel de tipo Object que cont�m um valor do n�
	private Link<T> proximo;		//Vari�vel que cont�m um link pro pr�ximo n�
	/**
     * Met�do que retorna o valor do n�
     * @return data, um objeto do dado do n�
     */
	public Object getData() {
		return data;
	}
	/**
     * Met�do que altera/seta o dado do n�
     * @param Object data, � um objeto do dado do n�
     */
	public void setData(Object data) {
		this.data = data;
	}
	/**
     * Met�do que retorna o pr�ximo n�
     * @return proximo um Link<T> que cont�m refer�ncia pro pr�ximo n�
     */
	public Link<T> getProximo() {
		return proximo;
	}
	/**
     * Met�do que altera/seta o pr�ximo n�
     * @param proximo, um Link<T> que cont�m refer�ncia pro pr�ximo n�
     */
	public void setProximo(Link<T> proximo) {
		this.proximo = proximo;
	} 
	/**
     * Construtor de Link
     * @param data, � um objeto de dado do n�
     */
	public Link(Object data){
		this.data = data;
	}
	
}