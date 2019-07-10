package agendawebjsf.telefone;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import entity.Telefone;
import impl.CidadeBUSINESS;

@ManagedBean(name = "telefoneRead")
	
public class TelefoneRead {
	//private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	private Collection<Cidade> telefones = null; 
	
	@PostConstruct
	public void init() {
		//this.telefones = business.read();
	}
	
	//public Collection<Telefone> getTelefones(){
		//return telefones;
	//}
	
	//public void setCidades(Collection<Telefone> telefones) {
		//this.telefones = telefones;
	//}
}
