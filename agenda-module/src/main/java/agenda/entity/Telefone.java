package agenda.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TELEFONE", schema = "public")
@SequenceGenerator(name = "SQ_TELEFONE", sequenceName="SQ_TELEFONE", schema = "public", initialValue = 1, allocationSize = 1)
public class Telefone {
	@Id
	@GeneratedValue(generator = "SQ_TELEFONE", strategy = GenerationType.SEQUENCE)
	@Column(name = "COD_TELEFONE", nullable=false, unique=true)
	private Integer codigo;
	
	@Column(name = "NUMERO_TELEFONE", length=9, nullable=false, unique=true)
	private Integer numero;
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = PrestadorServico.class)
		@JoinColumn(name = "COD_PRESTADOR_SERVICO", nullable = false)
	private PrestadorServico prestadorServico;
	
	public Telefone() {
		super();
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

	public PrestadorServico getPrestadorServico() {
		return prestadorServico;
	}

	public void setPrestadorServico(PrestadorServico prestadorServico) {
		this.prestadorServico = prestadorServico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Telefone other = (Telefone) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	

}
