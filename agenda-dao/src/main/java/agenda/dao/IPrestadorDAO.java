package agenda.dao;

import java.util.Collection;

import agenda.entity.PrestadorServico;

public interface IPrestadorDAO {

		void create(PrestadorServico prestador);
		
		Collection<PrestadorServico> read();
		
		void delete(PrestadorServico prestador);
		
		void update (PrestadorServico prestador);
		
		Boolean jaExisteEmail (PrestadorServico prestador);
		
	/*
	 * Boolean jaExisteEmail (String email);
	 * 
	 * Boolean jaExisteEmailCodigo(Integer codigo, String email);
	 */
}
