package br.com.lucasrodrigues.factorymethod.interfaces;

/**
 * @author Lucas Rodrigues
 * @since 11/03/2022
 */
public abstract class Form {

	public abstract IButton createButton();
	
	public void render(){
		IButton button = createButton();
		button.doAction();
		button.render();
	}
	
	
	
	public IButton getButton() {
		return this.getButton();
	}
}
