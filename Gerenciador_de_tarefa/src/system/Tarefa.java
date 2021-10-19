package system;
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
 * A classe Tarefa define as tarefas criadas pelo usu�rio para acompanhar seu gerenciador
 * @author alisson
 * @author Alexandre
 */
import java.util.GregorianCalendar;
public class Tarefa{
	private String titulo;
	private String descricao;
	private GregorianCalendar previsao;
	private String situacao;
	/**
	 * Constantes para padronizar a situa��o da tarefa
	 * @apiNote
	 */
	static final String PENDENTE = "Pendente";
	static final String EM_EXECUCAO = "Em execu��o";
	static final String FINALIZADO = "Finalizada";
	
	/**
	 * Construtor de Tarefa que cria uma nova tarefa inserindo titulo descri��o e previs�o de data
	 * @param title, do tipo String e se refere ao titulo da Tarefa
	 * @param descri, do tipo String e se refere a descri��o da Tarefa
	 * @param data, do tipo GregorianCalendar e se refere a data de previs�o de conclus�o da Tarefa
	 */
	public Tarefa(String title, String descri, GregorianCalendar data) {
		titulo = title;
		descricao = descri;
		previsao = data;
		marcarPendente();
	}
	/**
	 * M�todo que devolve o Titulo da Tarefa
	 * @return titulo, do tipo String e se refere ao titulo da Tarefa
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * M�todo que altera/seta o Titulo da Tarefa
	 * @param titulo, do tipo String e se refere ao titulo da Tarefa
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * M�todo que devolve a descri��o da Tarefa
	 * @return descricao, do tipo String e se refere a descri��o da Tarefa
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * M�todo que altera/seta a descri��o da Tarefa
	 * @param descricao, do tipo String e se refere a descri��o da Tarefa
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * M�todo que devolve a data de conclus�o da Tarefa
	 * @return previsao, do tipo GregorianCalendar e se refere a data de conclus�o da Tarefa
	 */
	public GregorianCalendar getPrevisao() {
		return previsao;
	}
	/**
	 * M�todo que altera/seta a data de conclus�o da Tarefa
	 * @param previsao, do tipo GregorianCalendar e se refere a data de conclus�o da Tarefa
	 */
	public void setPrevisao(GregorianCalendar previsao) {
		this.previsao = previsao;
	}
	/**
	 * M�todo que devolve a situa��o da Tarefa
	 * @return situacao, do tipo String e se refere a situa��o da Tarefa
	 */
	public String getSituacao() {
		return situacao;
	}
	/**
	 * M�todo que altera/seta a situa��o da Tarefa
	 * @param situacao, do tipo String e se refere a situa��o da Tarefa
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	/**
	 * M�todo que marca situa��o da Tarefa como Pendente
	 */
	public void marcarPendente() {
		situacao = Tarefa.PENDENTE;
	}
	/**
	 * M�todo que marca situa��o da Tarefa como Em Execu��o
	 */
	public void marcarExecucao() {
		situacao = Tarefa.EM_EXECUCAO;
	}
	/**
	 * M�todo que marca situa��o da Tarefa como Finalizada
	 */
	public void marcarFinalizada() {
		situacao = Tarefa.FINALIZADO;
	}
}