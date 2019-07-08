package agendawebjsf;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import impl.CidadeBUSINESS;

@ManagedBean(name = "cidadeCreate")
public class CidadeCreate {
	private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	private Cidade cidade = new Cidade();
	/*
	 * private String nome; private Integer codigo;
	 */

	public Cidade getCidade() {
		return cidade;
	}
	/*
	 * public String getNome() {
	 * 
	 * return nome; }
	 */
	
	public void setCidade(Cidade cidade) {
		this.cidade=cidade;
	}
	
	/*
	 * public void setNome(String nome) {
	 * 
	 * this.nome = nome; }
	 */
	
	/*
	 * public Integer getCodigo() { return codigo; }
	 */

	/*
	 * public void setCodigo(Integer codigo) { this.codigo = codigo; }
	 */
	
	public String create() /*throws BusinessException*/{
		// com throws nao e necessario try catch
		 try { 
		  //Cidade cidade = new Cidade(); 
		  //cidade.setNome(nome);
		  business.create(cidade);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "-", "Inserido com sucesso."));
		 return "read";
	}
	
	public String limpar() {
		//this.nome = null;
		this.cidade = new Cidade();
		return null; 
	}
	
}
