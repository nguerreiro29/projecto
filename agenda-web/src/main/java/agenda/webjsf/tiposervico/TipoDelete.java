package agenda.webjsf.tiposervico;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.business.ITipoBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.TipoServico;
import agenda.impl.CidadeBUSINESS;

@Component
@ManagedBean(name = "tipoDelete")
@RequestScope
public class TipoDelete {
	@Autowired
	private ITipoBUSINESS business;
	
	public String delete(TipoServico tipo) { 
		 try { 
		  business.delete(tipo);
		  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Tipo de Serviço apagado com sucesso."));
			
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", "Não foi possivel apagar o tipo de serviço."));  
		}
		  return "read"; 
	}
	
	
	
}
