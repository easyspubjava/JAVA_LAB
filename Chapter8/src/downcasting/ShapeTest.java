package downcasting;

import java.util.ArrayList;

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
	void circle()
	{
		System.out.println("원 입니다.");
	}
}

class Rectangle extends Shape{
	void draw()
	{
		System.out.println("draw Rectangle");
	}
	void rectangle()
	{
		System.out.println("사각형 입니다.");
	}
}

class Triangle extends Shape{
	void draw()
	{
		System.out.println("draw Triangle");
	}
	void triangle()
	{
		System.out.println("삼각형 입니다.");
	}
}


public class ShapeTest {

	ArrayList<Shape> sList = new ArrayList<Shape>();
	
	public static void main(String[] args) {
		
		ShapeTest sTest = new ShapeTest();
		sTest.addShape();
		System.out.println("원래 타입으로 다운 캐스팅 ");
		sTest.testCasting();
		
	}
	
	public void addShape()
	{
		sList.add(new Circle());    //ArrayList 에 추가되면서 Shape 타입으로 형 변환
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		for( Shape s : sList){     // 모두 Shape 타입으로 꺼내서 draw 호출하면
			s.draw();              // 오버라이딩된 함수가 호출 됨
		}
	}
	
	public void testCasting()
	{
		for(int i=0; i<sList.size(); i++){  //모든 배열 항목들을 하나씩 돌면서
			
			Shape s = sList.get(i);        // 일단 Shape 타입으로 가져옴
			if(s instanceof Circle){       //Circle 이면
				Circle c = (Circle)s;      //Circle 로 형변환
				c.circle();
			}
			else if(s instanceof Rectangle){  
				Rectangle r = (Rectangle)s;
				r.rectangle();
			}
			else if(s instanceof Triangle){
				Triangle t = (Triangle)s;
				t.triangle();
			}
			else{
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
}
