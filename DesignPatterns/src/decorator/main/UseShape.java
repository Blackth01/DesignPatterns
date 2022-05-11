package decorator.main;

import decorator.forms.Circle;
import decorator.forms.Rectangle;
import decorator.forms.Star;
import decorator.interfaces.Shape;

public class UseShape {

	public static void main(String[] args) {
		Shape circulo = new Circle();
		circulo.draw();

		RedShapeDecorator redShape = new RedShapeDecorator(new Rectangle());
		redShape.draw();

		RedShapeDecorator estrela = new RedShapeDecorator(new Star());
		estrela.draw();
	}

}
