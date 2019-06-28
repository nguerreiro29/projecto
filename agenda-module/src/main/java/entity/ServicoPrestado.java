package entity;

public class ServicoPrestado {
	
	private Integer codigo;
	private PrestacaoServico prestacaoServico;
	private TipoServico tipoServico;
	private Double valor;
	
	
	public ServicoPrestado() {
		super();
	}
	
	public ServicoPrestado (Integer codigo, PrestacaoServico prestacaoServico, TipoServico tipoServico, Double valor) {
		super();
		this.codigo = codigo;
		this.prestacaoServico = prestacaoServico;
		this.tipoServico = tipoServico;
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public PrestacaoServico getPrestacaoServico() {
		return prestacaoServico;
	}

	public void setPrestacaoServico(PrestacaoServico prestacaoServico) {
		this.prestacaoServico = prestacaoServico;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	
	
	

}
