package agenda.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import agenda.dao.IPrestadorDAO;
import agenda.entity.PrestadorServico;

//@Repository
public class PrestadorDAO implements IPrestadorDAO {

	static List<PrestadorServico> prestadores = new ArrayList<PrestadorServico>();
	
	private static Integer id = 0;
	
	@Override
	public void create(PrestadorServico prestador) {
		id++;
		prestador.setCodigo(id);
		prestadores.add(prestador);
	}

	@Override
	public Collection<PrestadorServico> read() {
		return prestadores;
	}

	@Override
	public void delete(PrestadorServico prestador) {
		prestadores.remove(prestador);
	}

	@Override
	public void update(PrestadorServico prestador) {
		int index = prestadores.indexOf(prestador);
		prestadores.set(index, prestador);  
	}

	@Override
	public Boolean jaExisteEmail(PrestadorServico prestador) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/*
	 * @Override public Boolean jaExisteEmail(String email) {
	 * 
	 * for (PrestadorServico prestador: prestadores) {
	 * if(prestador.getEmail().trim().equalsIgnoreCase(email)) { return
	 * Boolean.TRUE; } } return Boolean.FALSE; }
	 * 
	 * @Override public Boolean jaExisteEmailCodigo(Integer codigo, String email) {
	 * for (PrestadorServico prestador: prestadores) {
	 * if(prestador.getEmail().trim().equalsIgnoreCase(email) &&
	 * !prestador.getCodigo().equals(codigo)) { return Boolean.TRUE; } } return
	 * Boolean.FALSE; }
	 */
}
