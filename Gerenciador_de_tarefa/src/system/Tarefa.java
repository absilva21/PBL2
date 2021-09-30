package system;

import java.util.Observable;
import java.util.Observer;
import java.util.Date;

public class Tarefa implements Observer {
	private String titulo;
	private String descricao;
	private Date previsao;
	private String situacao;
	
	static final String PEDENTE = "Pendente";
	static final String EM_EXECUCAO = "Em execução";
	static final String FINALIZADO = "Finalizada";
	
	public Tarefa(String title, String descri, Date data) {
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
	public Date getPrevisao() {
		return previsao;
	}
	public void setPrevisao(Date previsao) {
		this.previsao = previsao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

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
