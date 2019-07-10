package agenda.webjsf.prestador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.PrestadorServico;
import agenda.impl.CidadeBUSINESS;

//@Component
@ManagedBean(name = "prestadorCreate")
public class PrestadorCreate {
	
	//@Autowired
	private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	private PrestadorServico prestador = new PrestadorServico();
	
	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}
	
	public String create() {
		 try { 
		  //business.create(cidade);
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
