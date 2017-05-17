package model;

import java.util.Date;

public class Nfsg {
	private String municipio;
	private String razao;
	private Date emissao;
	private int numero;
	private String origem;
	private String numEuipamento;
	private float valor;
	private Date registro;
	private String tipo;
	private String operacaoSituacao;
	
	public Nfsg(String municipio, String razao, Date emissao, int numero, String origem, String numEuipamento, float valor, Date registro, String tipo, String operacaoSituacao) {
		this.municipio = municipio;
		this.razao = razao;
		this.emissao = emissao;
		this.numero = numero;
		this.origem = origem;
		this.numEuipamento = numEuipamento;
		this.valor = valor;
		this.registro = registro;
		this.tipo = tipo;
		this.operacaoSituacao = operacaoSituacao;
	}
	
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public Date getEmissao() {
		return emissao;
	}
	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getNumEuipamento() {
		return numEuipamento;
	}
	public void setNumEuipamento(String numEuipamento) {
		this.numEuipamento = numEuipamento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getRegistro() {
		return registro;
	}
	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getOperacaoSituacao() {
		return operacaoSituacao;
	}
	public void setOperacaoSituacao(String operacaoSituacao) {
		this.operacaoSituacao = operacaoSituacao;
	}
}
