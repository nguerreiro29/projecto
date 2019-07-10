package agenda.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import agenda.dao.ICidadeDAO;
import agenda.entity.Cidade;

@Repository
public class CidadeDAO implements ICidadeDAO {

	static List<Cidade> cidades = new ArrayList<Cidade>();
	
	private static Integer id = 0;
	
	@Override
	public void create(Cidade cidade) {
		//incremento id
		id++;
		
		//actualiza codigo
		cidade.setCodigo(id);
		
		//adiciona cidade a lista
		cidades.add(cidade);
	}

	@Override
	public Collection<Cidade> read() {
		return cidades;
	}

	@Override
	public void delete(Cidade cidade) {
		cidades.remove(cidade);
	}

	@Override
	public void update(Cidade cidade) {
		int index = cidades.indexOf(cidade);
		cidades.set(index, cidade);  
	}

	@Override
	public Boolean jaExisteCidade(String nome) {
		
		  for (Cidade cidade: cidades) { 
			  if(cidade.getNome().trim().equalsIgnoreCase(nome)) 
			  {
				  return Boolean.TRUE;
			  }
		  }
		return Boolean.FALSE;
	}
	
	@Override
	public Boolean jaExisteCidadeCodigo(Integer codigo, String nome) {
		
		  for (Cidade cidade: cidades) { 
			  if(cidade.getNome().trim().equalsIgnoreCase(nome) && !cidade.getCodigo().equals(codigo)) 
			  {
				  return Boolean.TRUE;
			  }
		  }
		return Boolean.FALSE;
	}
}
