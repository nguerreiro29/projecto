package entity;

public class Cidade {
	
	private Integer codigo;
	private String nome;
	
	public Cidade() {
		super();
	}
	
	public Cidade(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Cidade(Integer codigo) {
		super();
		this.codigo = codigo;
	}
	
	public Cidade(String nome) {
		super();
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		//result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		
		/*
		 * if (nome == null) { if (other.nome != null) return false; } else if
		 * (!nome.equals(other.nome)) return false;
		 */
		 
		return true;
	}
	
	
	
	
}
