package br.com.lucasrodrigues.factorymethod.entities;

import br.com.lucasrodrigues.factorymethod.interfaces.IButton;
import br.com.lucasrodrigues.factorymethod.interfaces.Form;

/**
 * @author Lucas Rodrigues
 * @since 11/03/2022
 */
public class FormWindows extends Form{

	@Override
	public IButton createButton() {
		return new ButtonWindows();
	}

}
