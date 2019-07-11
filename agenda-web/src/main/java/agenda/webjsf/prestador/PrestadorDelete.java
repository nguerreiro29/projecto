package agenda.webjsf.prestador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.IPrestadorBUSINESS;
import agenda.entity.PrestadorServico;

@Component
@ManagedBean(name = "prestadorDelete")
@RequestScope
public class PrestadorDelete {
	@Autowired
	private IPrestadorBUSINESS business;
	
	public String delete(PrestadorServico prestador) { 
		 try { 
		  business.delete(prestador);
		  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Prestador apagado com sucesso."));
			
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", "Não foi possivel apagar o prestador."));  
		}
		  return "read"; 
	}
	
	
	
}
