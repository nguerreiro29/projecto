package agenda.business;

import java.util.Collection;

import agenda.entity.Cidade;
import agenda.entity.TipoServico;

public interface ITipoBUSINESS {
	
	void create(TipoServico tipo) throws BusinessException;
	
	Collection<TipoServico> read();
	
	void delete(TipoServico tipo);
	
	void update (TipoServico tipo) throws BusinessException;
	
	

}
