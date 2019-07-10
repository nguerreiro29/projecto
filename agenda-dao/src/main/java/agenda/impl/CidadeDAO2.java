package agenda.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import agenda.dao.ICidadeDAO;
import agenda.entity.Cidade;

public class CidadeDAO2 /* implements ICidadeDAO */ { // poderiamos fazer uma super classe para cidadedao e cidadedao2

	/*
	 * static Set<Cidade> cidades = new HashSet<Cidade>();
	 * 
	 * private static Integer id = 0;
	 * 
	 * @Override public void create(Cidade cidade) { //incremento id id++;
	 * 
	 * //actualiza codigo cidade.setCodigo(id);
	 * 
	 * //adiciona cidade a lista cidades.add(cidade); }
	 * 
	 * @Override public Collection<Cidade> read() { return cidades; }
	 * 
	 * @Override public void delete(Cidade cidade) { cidades.remove(cidade); //para
	 * utilizar o hashset e necessario fzr overriding do hashcode()
	 * 
	 * }
	 * 
	 * @Override public void update(Cidade cidade) {
	 * 
	 * int index = cidades.indexOf(cidade); cidades.set(index, cidade); // ArrayList
	 * 
	 * for (Cidade cidadeloop: cidades) { //HashSet
	 * if(cidadeloop.getCodigo().equals(cidade.getCodigo())) {
	 * cidadeloop.setNome(cidade.getNome()); break; } } }
	 * 
	 * @Override public Boolean jaExisteCidade(String nome) {
	 * 
	 * for (Cidade cidade: cidades) {
	 * if(cidade.getNome().trim().equalsIgnoreCase(nome)) { return Boolean.TRUE; } }
	 * return Boolean.FALSE; }
	 * 
	 * @Override public Boolean jaExisteCidadeCodigo(Integer codigo, String nome) {
	 * 
	 * for (Cidade cidade: cidades) {
	 * if(cidade.getNome().trim().equalsIgnoreCase(nome) &&
	 * !cidade.getCodigo().equals(codigo)) { return Boolean.TRUE; } } return
	 * Boolean.FALSE; }
	 */
}
