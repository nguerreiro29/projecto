package agenda.webjsf.tiposervico;

import java.util.Collection;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.ITipoBUSINESS;
import agenda.entity.TipoServico;

@Component	
@ManagedBean(name = "tipoRead")
@RequestScope
public class TipoRead {
	@Autowired
	private ITipoBUSINESS business;
	
	/*
	 * private Collection<TipoServico> tipos = null;
	 * 
	 * @PostConstruct public void init() { this.tipos = business.read(); }
	 */
	public Collection<TipoServico> getTipos(){
		return business.read();
	}
	
	/*
	 * public void setTipos(Collection<TipoServico> tipos) { this.tipos = tipos; }
	 */
}
