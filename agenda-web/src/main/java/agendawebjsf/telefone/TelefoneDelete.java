package agendawebjsf.telefone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import entity.Telefone;
import impl.CidadeBUSINESS;

@ManagedBean(name = "telefoneDelete")
public class TelefoneDelete {
	//private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	public String delete(Telefone telefone) { 
		 try { 
		  //business.delete(cidade);
		  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Telefone apagado com sucesso."));
			
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", "Não foi possivel apagar o telefone."));  
		}
		  return "read"; 
	}
	
	
	
}
