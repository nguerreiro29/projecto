package agenda.entity;

import java.util.Set;

import agenda.enums.TipoLogradouro;

public class PrestadorServico {
	
	private Integer codigo;
	private String nome;
	private Cidade cidade;
	private String bairro;
	private String cep;
	private TipoLogradouro tipoLogradouro;
	private String logradouro;
	private String complemento;
	private String numero;
	private String email;
	private Set<Telefone> telefones;
	private Set<TipoServico> servicosCredenciados;
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
