package agenda.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import agenda.dao.ITipoDAO;
import agenda.entity.TipoServico;

//@Repository
public class TipoDAO implements ITipoDAO {

	static List<TipoServico> tipos = new ArrayList<TipoServico>();
	
	private static Integer id = 0;
	
	@Override
	public void create(TipoServico tipo) {
		id++;
		tipo.setCodigo(id);
		tipos.add(tipo);
	}

	@Override
	public Collection<TipoServico> read() {
		return tipos;
	}

	@Override
	public void delete(TipoServico tipo) {
		tipos.remove(tipo);
	}

	@Override
	public void update(TipoServico tipo) {
		int index = tipos.indexOf(tipo);
		tipos.set(index, tipo);  
	}

	/*
	 * @Override public Boolean jaExisteTipo(String descricao) {
	 * 
	 * for (TipoServico tipo: tipos) {
	 * if(tipo.getDescricao().trim().equalsIgnoreCase(descricao)) { return
	 * Boolean.TRUE; } } return Boolean.FALSE; }
	 * 
	 * @Override public Boolean jaExisteTipoCodigo(Integer codigo, String descricao)
	 * {
	 * 
	 * for (TipoServico tipo: tipos) {
	 * if(tipo.getDescricao().trim().equalsIgnoreCase(descricao) &&
	 * !tipo.getCodigo().equals(codigo)) { return Boolean.TRUE; } } return
	 * Boolean.FALSE; }
	 */

	@Override
	public Boolean jaExisteTipo(TipoServico tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
