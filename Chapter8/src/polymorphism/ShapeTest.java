package polymorphism;

class Shape{
	void draw()
	{
		System.out.println("draw Shape");
	}
}

class Circle extends Shape{
	void draw()
	{
		System.out.println("draw Circle");
	}
}

class Rectangle extends Shape{
	void draw()
	{
		System.out.println("draw Rectangle");
	}
}

class Triangle extends Shape{
	void draw()
	{
		System.out.println("draw Triangle");
	}
}


public class ShapeTest {

	public static void main(String[] args) {
		
		ShapeTest sTest = new ShapeTest();
		sTest.drawShapeTest(new Circle());
		sTest.drawShapeTest(new Rectangle());
		sTest.drawShapeTest(new Triangle());
	}

	public void drawShapeTest(Shape s){
		s.draw();
	}
}
