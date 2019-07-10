package agenda.dao;

import java.util.Collection;
import java.util.List;

import agenda.entity.Cidade;
import agenda.entity.TipoServico;

public interface ITipoDAO {

		void create(TipoServico tipo);
		
		Collection<TipoServico> read();
		
		void delete(TipoServico tipo);
		
		void update (TipoServico tipo);
		
		Boolean jaExisteTipo (String descricao);

		Boolean jaExisteTipoCodigo(Integer codigo, String descricao);
}
