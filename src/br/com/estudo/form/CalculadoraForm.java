package br.com.estudo.form;

import org.apache.struts.action.ActionForm;

import br.com.estudo.model.Calculadora;

public class CalculadoraForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Calculadora calculadora = new Calculadora();
	
	public Calculadora getCalculadora() {
		return calculadora;
	}

}
