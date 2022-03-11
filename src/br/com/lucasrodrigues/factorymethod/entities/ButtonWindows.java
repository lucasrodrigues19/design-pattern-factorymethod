package br.com.lucasrodrigues.factorymethod.entities;

import br.com.lucasrodrigues.factorymethod.interfaces.IButton;

/**
 * @author Lucas Rodrigues
 * @since 11/03/2022
 */
public class ButtonWindows implements IButton{

	@Override
	public void doAction() {
		System.out.println("Aqui vai ser executada ação do botão windows");
	}

	@Override
	public void render() {
		System.out.println(" Renderizando o formulario Windows");
	}

}
