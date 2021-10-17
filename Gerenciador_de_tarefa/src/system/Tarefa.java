package system;

import java.util.GregorianCalendar;
public class Tarefa{
	private String titulo;
	private String descricao;
	private GregorianCalendar previsao;
	private String situacao;
	/**
	 * constantes para pradronizar a situação da tarefa
	 * @apiNote
	 */
	static final String PEDENTE = "Pendente";
	static final String EM_EXECUCAO = "Em execução";
	static final String FINALIZADO = "Finalizada";
	
	/**
	 * Cria uma nova tarefa inserindo título descrição e previsão
	 * @param title
	 * @param descri
	 * @param data
	 */
	public Tarefa(String title, String descri, GregorianCalendar data) {
		titulo = title;
		descricao = descri;
		previsao = data;
		marcarPedente();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public GregorianCalendar getPrevisao() {
		return previsao;
	}
	public void setPrevisao(GregorianCalendar previsao) {
		this.previsao = previsao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	

	public void marcarPedente() {
		situacao = Tarefa.PEDENTE;
	}
	
	public void marcarExecucao() {
		situacao = Tarefa.EM_EXECUCAO;
	}
	
	public void marcarFinalizada() {
		situacao = Tarefa.FINALIZADO;
	}

}
