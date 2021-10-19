package system;
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
 * A classe Tarefa define as tarefas criadas pelo usuário para acompanhar seu gerenciador
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
	 * Constantes para padronizar a situação da tarefa
	 * @apiNote
	 */
	static final String PENDENTE = "Pendente";
	static final String EM_EXECUCAO = "Em execução";
	static final String FINALIZADO = "Finalizada";
	
	/**
	 * Construtor de Tarefa que cria uma nova tarefa inserindo titulo descrição e previsão de data
	 * @param title, do tipo String e se refere ao titulo da Tarefa
	 * @param descri, do tipo String e se refere a descrição da Tarefa
	 * @param data, do tipo GregorianCalendar e se refere a data de previsão de conclusão da Tarefa
	 */
	public Tarefa(String title, String descri, GregorianCalendar data) {
		titulo = title;
		descricao = descri;
		previsao = data;
		marcarPendente();
	}
	/**
	 * Método que devolve o Titulo da Tarefa
	 * @return titulo, do tipo String e se refere ao titulo da Tarefa
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Método que altera/seta o Titulo da Tarefa
	 * @param titulo, do tipo String e se refere ao titulo da Tarefa
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Método que devolve a descrição da Tarefa
	 * @return descricao, do tipo String e se refere a descrição da Tarefa
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * Método que altera/seta a descrição da Tarefa
	 * @param descricao, do tipo String e se refere a descrição da Tarefa
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * Método que devolve a data de conclusão da Tarefa
	 * @return previsao, do tipo GregorianCalendar e se refere a data de conclusão da Tarefa
	 */
	public GregorianCalendar getPrevisao() {
		return previsao;
	}
	/**
	 * Método que altera/seta a data de conclusão da Tarefa
	 * @param previsao, do tipo GregorianCalendar e se refere a data de conclusão da Tarefa
	 */
	public void setPrevisao(GregorianCalendar previsao) {
		this.previsao = previsao;
	}
	/**
	 * Método que devolve a situação da Tarefa
	 * @return situacao, do tipo String e se refere a situação da Tarefa
	 */
	public String getSituacao() {
		return situacao;
	}
	/**
	 * Método que altera/seta a situação da Tarefa
	 * @param situacao, do tipo String e se refere a situação da Tarefa
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	/**
	 * Método que marca situação da Tarefa como Pendente
	 */
	public void marcarPendente() {
		situacao = Tarefa.PENDENTE;
	}
	/**
	 * Método que marca situação da Tarefa como Em Execução
	 */
	public void marcarExecucao() {
		situacao = Tarefa.EM_EXECUCAO;
	}
	/**
	 * Método que marca situação da Tarefa como Finalizada
	 */
	public void marcarFinalizada() {
		situacao = Tarefa.FINALIZADO;
	}
}