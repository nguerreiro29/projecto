package agenda.business;

import java.util.Collection;

import agenda.entity.PrestadorServico;

public interface IPrestadorBUSINESS {
	
	void create(PrestadorServico prestador) throws BusinessException;
	
	Collection<PrestadorServico> read();
	
	void delete(PrestadorServico prestador);
	
	void update (PrestadorServico prestador) throws BusinessException;
	
	

}
