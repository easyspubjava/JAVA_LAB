package finalex;

public class UsingDefine {

	public static void main(String[] args) {

		System.out.println(Define.GOOD_MORNING);   //static 으로 선언되었으므로 클래스 이름으로 참조 합니다.
		System.out.println("최솟값은 " +  Define.MIN + "입니다.");
		System.out.println("최댓값은 " +  Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
		
	}

}
