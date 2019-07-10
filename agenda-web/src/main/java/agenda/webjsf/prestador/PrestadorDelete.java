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
@ManagedBean(name = "prestadorDelete")
public class PrestadorDelete {
	//@Autowired
	private ICidadeBUSINESS business  = new CidadeBUSINESS();
	
	public String delete(PrestadorServico prestador) { 
		 try { 
		  //business.delete(cidade);
		  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Prestador apagado com sucesso."));
			
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", "Não foi possivel apagar a cidade."));  
		}
		  return "read"; 
	}
	
	
	
}
