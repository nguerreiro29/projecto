package agenda.webjsf.telefone;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.Telefone;
import agenda.impl.CidadeBUSINESS;

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
