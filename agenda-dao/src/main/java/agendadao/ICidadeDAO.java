package agendadao;

import java.util.Collection;
import java.util.List;

import entity.Cidade;

public interface ICidadeDAO {

		void create(Cidade cidade);
		
		//List<Cidade> read();
		Collection<Cidade> read();
		
		//Boolean delete(Short codigo);
		void delete(Cidade cidade);
		
		void update (Cidade cidade);
		
		Boolean jaExisteCidade (String nome);

		Boolean jaExisteCidadeCodigo(Integer codigo, String nome);
}
