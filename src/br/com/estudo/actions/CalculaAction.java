package br.com.estudo.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.estudo.form.CalculadoraForm;

public class CalculaAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		CalculadoraForm calculadoraForm = (CalculadoraForm) form;

		String calculo = null;
		String expressao = null;

		if (request.getParameter("soma") != null) {
			expressao = request.getParameter("soma");
			if (expressao.equals("Somar")) {
				calculo = "A soma é: " + (calculadoraForm.getCalculadora().getNumero1() + calculadoraForm.getCalculadora().getNumero2());
			}
		} else if (request.getParameter("subtrair") != null) {
			expressao = request.getParameter("subtrair");
			if (expressao.equals("Subtrair")) {
				calculo = "A subtração é: " + (calculadoraForm.getCalculadora().getNumero1() - calculadoraForm.getCalculadora().getNumero2());
			}
		}
		
		request.setAttribute("calculo", calculo);

		return mapping.findForward("ok");
	}

}
