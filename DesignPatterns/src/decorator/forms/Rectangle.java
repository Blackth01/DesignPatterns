package decorator.forms;

import decorator.interfaces.Shape;

public class Rectangle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Desenha um retângulo");
	}
}
