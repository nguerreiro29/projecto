package agenda.entity;

public class Telefone {
	
	private Integer codigo;
	private Integer numero;
	//private PrestadorServico prestadorServico;
	
	public Telefone() {
		super();
	}
	
	public Telefone(Integer codigo, Integer numero){
		super();
		this.codigo = codigo;
		this.numero = numero;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	

}
