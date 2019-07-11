package agenda.webjsf.telefone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.Telefone;
import agenda.impl.CidadeBUSINESS;
//import agenda.impl.TelefoneBUSINESS;

@ManagedBean(name = "telefoneCreate")
public class TelefoneCreate {
		//private ITelefoneBUSINESS business = new TelefoneBUSINESS();
		
		private Telefone telefone = new Telefone();

		public Telefone getTelefone() {
			return telefone;
		}

		public void setTelefone(Telefone telefone) {
			this.telefone = telefone;
		}
		
		public String create() {
			 try { 
			  //business.create(telefone);
			}
			  catch (Exception e){
				  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
				  return null;
			}
			 
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Telefone inserido com sucesso."));
			 return "read";
		}
		
		public String limpar() {
			this.telefone = new Telefone();
			return null; 
		}
	
}
