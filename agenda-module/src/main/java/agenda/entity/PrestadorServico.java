package agenda.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import agenda.enums.TipoLogradouro;

@Entity
@Table(name = "TB_PRESTADOR_SERVICO", schema = "public")
@SequenceGenerator(name = "SQ_PRESTADOR_SERVICO", sequenceName="SQ_PRESTADOR_SERVICO", schema = "public", initialValue = 1, allocationSize = 1)
public class PrestadorServico implements Serializable{
	@Id
	@GeneratedValue(generator = "SQ_PRESTADOR_SERVICO", strategy = GenerationType.SEQUENCE)
	@Column(name = "COD_PRESTADOR_SERVICO", nullable=false, unique=true)
	private Integer codigo;
	
	@Column(name = "NOME_PRESTADOR_SERVICO", length=60, nullable=false, unique=true)
	private String nome;
	
	//@ManyToOne
	@Transient
	private Cidade cidade;
	
	@Column(name = "BAIRRO_PRESTADOR_SERVICO", length=60, nullable=false, unique=true)
	private String bairro;
	
	@Column(name = "CEP_PRESTADOR_SERVICO", length=60, nullable=false, unique=true)
	private String cep;
	
	@Transient
	private TipoLogradouro tipoLogradouro;
	
	@Column(name = "LOGRADOURO_PRESTADOR_SERVICO", length=60, nullable=false, unique=true)
	private String logradouro;
	
	@Column(name = "COMPLEMENTO_PRESTADOR_SERVICO", length=60, nullable=false, unique=true)
	private String complemento;
	
	@Column(name = "NUMERO_PRESTADOR_SERVICO", length=60, nullable=false, unique=true)
	private String numero;
	
	@Column(name = "EMAIL_PRESTADOR_SERVICO", length=60, nullable=false, unique=true)
	private String email;
	
	@Transient
	private Set<Telefone> telefones;
	
	@Transient
	private Set<TipoServico> servicosCredenciados;
	
	@Transient
	private Set<PrestacaoServico> prestacoesServicos;
	
	public PrestadorServico() {
		super();
	}
	
	public PrestadorServico(Integer codigo, String nome, Cidade cidade, String bairro, String cep, TipoLogradouro tipoLogradouro, String logradouro, String complemento, 
			String numero, String email, Telefone telefones, TipoServico servicosCredenciados, PrestacaoServico prestacoesServicos) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.cidade = cidade;
			this.bairro = bairro;
			this.cep = cep;
			this.tipoLogradouro = tipoLogradouro;
			this.logradouro = logradouro;
			this.complemento = complemento;
			this.numero = numero;
			this.email = email;
			this.telefones.add(telefones);
			this.servicosCredenciados.add(servicosCredenciados);
			this.prestacoesServicos.add(prestacoesServicos);
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
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Set<TipoServico> getServicosCredenciados() {
		return servicosCredenciados;
	}
	public void setServicosCredenciados(Set<TipoServico> servicosCredenciados) {
		this.servicosCredenciados = servicosCredenciados;
	}
	public Set<PrestacaoServico> getPrestacoesServicos() {
		return prestacoesServicos;
	}
	public void setPrestacoesServicos(Set<PrestacaoServico> prestacoesServicos) {
		this.prestacoesServicos = prestacoesServicos;
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
		PrestadorServico other = (PrestadorServico) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	
	
	
	
	

}
