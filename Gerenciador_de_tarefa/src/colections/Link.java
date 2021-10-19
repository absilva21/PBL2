package colections;
/*******************************************************************************
Autor: Alisson Bomfim da Silva e Alexandre Silva Caribé
Componente Curricular: Algoritmos e Programação II
Concluido em: 14/10/2011
Declaro que este cÃ³digo foi elaborado por mim de forma individual e nÃ£o contÃ©m nenhum
trecho de cÃ³digo de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e pÃ¡ginas ou documentos eletrÃ´nicos da Internet. Qualquer trecho de cÃ³digo
de outra autoria que nÃ£o a minha estÃ¡ destacado com uma citaÃ§Ã£o para o autor e a fonte
do cÃ³digo, e estou ciente que estes trechos nÃ£o serÃ£o considerados para fins de avaliaÃ§Ã£o.
******************************************************************************************/
/**
 * A classe Link<T> define um tipo de nó genérico que é utilizado pela lista
 * @author alisson
 * @author Alexandre
 */
public class Link<T> {
	private Object data;			//Variável de tipo Object que contém um valor do nó
	private Link<T> proximo;		//Variável que contém um link pro próximo nó
	/**
     * Metódo que retorna o valor do nó
     * @return data, um objeto do dado do nó
     */
	public Object getData() {
		return data;
	}
	/**
     * Metódo que altera/seta o dado do nó
     * @param Object data, é um objeto do dado do nó
     */
	public void setData(Object data) {
		this.data = data;
	}
	/**
     * Metódo que retorna o próximo nó
     * @return proximo um Link<T> que contém referência pro próximo nó
     */
	public Link<T> getProximo() {
		return proximo;
	}
	/**
     * Metódo que altera/seta o próximo nó
     * @param proximo, um Link<T> que contém referência pro próximo nó
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