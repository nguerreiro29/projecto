package agenda.webjsf.cidade;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import agenda.entity.Cidade;

@FacesConverter(value="cidadeConverter",forClass = Cidade.class)
public class CidadeConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Cidade cidade = new Cidade();
		if(value == null || value.isEmpty())
		{
			cidade = null;
		}
		else
		{
			cidade.setCodigo(Integer.valueOf(value));
		}
		return cidade;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Cidade cidade = null;
		if(value instanceof Cidade)
		{
			cidade = (Cidade) value;
			return String.valueOf(cidade.getCodigo());
		}
		return (String) value;
	}

}
