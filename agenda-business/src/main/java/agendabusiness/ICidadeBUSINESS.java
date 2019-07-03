package agendabusiness;

import java.util.Collection;

import entity.Cidade;

public interface ICidadeBUSINESS {
	
	void create(Cidade cidade) throws BusinessException;
	
	//List<Cidade> read();
	Collection<Cidade> read();
	
	//Boolean delete(Short codigo);
	void delete(Cidade cidade);
	
	void update (Cidade cidade) throws BusinessException;
	
	

}
