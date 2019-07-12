package agenda.webjsf.tiposervico;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import agenda.entity.TipoServico;

@FacesConverter(value="tipoServicoConverter",forClass = TipoServico.class)
public class TipoServicoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		TipoServico tipo = new TipoServico();
		if(value == null || value.isEmpty())
		{
			tipo = null;
		}
		else
		{
			tipo.setCodigo(Integer.valueOf(value));
		}
		return tipo;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		TipoServico tipo = null;
		if(value instanceof TipoServico)
		{
			tipo = (TipoServico) value;
			return String.valueOf(tipo.getCodigo());
		}
		return (String) value;
	}

}
