package polymorphism;

import java.util.ArrayList;



public class AnimalTest2 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println("원래 타입으로 다운 캐스팅 ");
		aTest.testCasting();

	}
	
	public void addAnimal()
	{
		aniList.add(new Human());    //ArrayList에 추가되면서 Animal형으로 형 변환
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList){     // 배열의 요소들을 Animal형으로 꺼내서 move 호출하면
			ani.move();              // 오버라이딩된 함수가 호출 됨
		}
	}

	
	public void testCasting()
	{
		for(int i=0; i<aniList.size(); i++){  //모든 배열 항목들을 하나씩 돌면서
			
			Animal ani = aniList.get(i);        // 일단 Shape 타입으로 가져옴
			if(ani instanceof Human){       //Circle이면
				Human h = (Human)ani;      //Circle형으로 다운 캐스팅
				h.readBook();
			}
			else if(ani instanceof Tiger){  
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle){
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else{
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
}



