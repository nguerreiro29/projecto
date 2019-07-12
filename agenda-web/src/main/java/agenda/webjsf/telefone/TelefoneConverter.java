package agenda.webjsf.telefone;

import java.util.Set;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import agenda.entity.Cidade;
import agenda.entity.Telefone;

@FacesConverter(value="telefoneConverter",forClass = Cidade.class)
public class TelefoneConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Telefone telefone = new Telefone();
		Set<Telefone> telefones;
		if(value == null || value.isEmpty())
		{
			telefone = null;
		}
		else
		{
			telefone.setNumero(Integer.valueOf(value));
			
		}
		return telefone;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Telefone telefone = null;
		if(value instanceof Telefone)
		{
			telefone = (Telefone) value;
			return String.valueOf(telefone.getNumero());
		}
		return (String) value;
	}

}
