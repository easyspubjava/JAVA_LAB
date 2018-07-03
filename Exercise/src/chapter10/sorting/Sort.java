package chapter10.sorting;

public interface Sort {

	void ascending(int[] arr);
	void descending(int[] arr);
	
	default void description(){
		System.out.println("숫자를 정렬하는 알고리즘 입니다");
	}	
}
