package agenda.entity;

import java.util.Date;
import java.util.Set;

public class PrestacaoServico {
	
	private Integer codigo;
	private Date data;
	private PrestadorServico prestadorServico;
	private Set<ServicoPrestado> servicoPrestados;
	
	public PrestacaoServico() {
		super();
	}
	
	public PrestacaoServico(Integer codigo, Date data, PrestadorServico prestadorServico, ServicoPrestado servicoPrestados) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.prestadorServico = prestadorServico;
		this.servicoPrestados.add(servicoPrestados);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public PrestadorServico getPrestadorServico() {
		return prestadorServico;
	}

	public void setPrestadorServico(PrestadorServico prestadorServico) {
		this.prestadorServico = prestadorServico;
	}

	public Set<ServicoPrestado> getServicoPrestados() {
		return servicoPrestados;
	}

	public void setServicoPrestados(Set<ServicoPrestado> servicoPrestados) {
		this.servicoPrestados = servicoPrestados;
	}

	
	
	

}
