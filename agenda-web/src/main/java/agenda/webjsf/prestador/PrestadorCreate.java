package agenda.webjsf.prestador;

import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.IPrestadorBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.PrestadorServico;
import agenda.enums.TipoLogradouro;

@Component
@ManagedBean(name = "prestadorCreate")
@RequestScope
public class PrestadorCreate {
	
	@Autowired
	private IPrestadorBUSINESS business;
	
	/* public TipoLogradouro tipologradouro; */
	
	private PrestadorServico prestador = new PrestadorServico();
	
	private Cidade cidade = new Cidade();
	
	
	
	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}
	
	/*
	 * public void init() { return business.read(); }
	 */
	 public TipoLogradouro[] getTipoLogradouro()
	 { 
		 return TipoLogradouro.values();
	 }
	 
	 
	
	public String create() {
		 try { 
		  business.create(prestador);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Prestador inserido com sucesso."));
		 return "read";
	}
	
	public String limpar() {
		this.prestador = new PrestadorServico();
		return null; 
	}
	
}
