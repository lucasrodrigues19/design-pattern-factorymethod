package br.com.lucasrodrigues.factorymethod.main;

import br.com.lucasrodrigues.factorymethod.entities.FormLinux;
import br.com.lucasrodrigues.factorymethod.entities.FormWindows;
import br.com.lucasrodrigues.factorymethod.interfaces.Form;

/**
 * @author Lucas Rodrigues
 * @since 11/03/2022
 */
public class Main {
	
	public static Form initialize() {
		String os = System.getProperty("os.name");
		if(os.toUpperCase().contains("LINUX"))
			return new FormLinux();
		else if(os.toUpperCase().contains("WINDOWS"))
			return new FormWindows();
		throw new RuntimeException("Formulario não possui recurso para esse sistema operacional");
	}
	
	public static void main(String[] args) {
		Form form = initialize();
		form.render();
	}
	
	
}
