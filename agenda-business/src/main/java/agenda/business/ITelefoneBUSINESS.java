package agenda.business;

import java.util.Collection;

import agenda.entity.Telefone;

public interface ITelefoneBUSINESS {
	
	void create(Telefone telefone) throws BusinessException;
	
	Collection<Telefone> read();
	
	void delete(Telefone telefone);
	
	void update (Telefone telefone) throws BusinessException;
	
}
