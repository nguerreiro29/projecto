package agendawebjsf.telefone;

import javax.faces.bean.ManagedBean;

import agendabusiness.ICidadeBUSINESS;
import impl.CidadeBUSINESS;

@ManagedBean(name = "telefoneCreate")
public class TelefoneCreate {
		private ICidadeBUSINESS business = new CidadeBUSINESS();
	
}
