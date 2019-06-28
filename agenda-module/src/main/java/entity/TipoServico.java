package entity;

public class TipoServico {
	
	private Integer codigo;
	private Integer descricao;
	
	public TipoServico() {
		super();
	}
	
	public TipoServico(Integer codigo, Integer descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getDescricao() {
		return descricao;
	}

	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}
	
	

}
