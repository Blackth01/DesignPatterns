package decorator.forms;

import decorator.interfaces.Shape;

public class Circle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Desenha um c�rculo");
	}
}
