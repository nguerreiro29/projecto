package agenda.dao;

import java.util.Collection;

import agenda.entity.TipoServico;

public interface ITipoDAO {

		void create(TipoServico tipo);
		
		Collection<TipoServico> read();
		
		void delete(TipoServico tipo);
		
		void update (TipoServico tipo);
		
		Boolean jaExisteTipo (String descricao);

		Boolean jaExisteTipoCodigo(Integer codigo, String descricao);
}
