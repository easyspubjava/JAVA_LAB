package generics;

class MyArrayG<E>{
	private Object[] array = new Object[10];
	int i;
	
	public void add(E obj){
		array[i++] = obj;
	}
	
	public E get(int index){
		return (E)array[index];
	}
}

public class MyArrayTest {

	public static void main(String[] args) {
		
		MyArrayG<String> myArray1 = new MyArrayG<String>();
		myArray1.add(new String("test"));
		String str = myArray1.get(0);  //형 변환 하지 않음
		System.out.println(str);
		
		MyArrayG<Integer> myArray2 = new MyArrayG<Integer>();
		myArray2.add(new Integer(100));
		Integer num = myArray2.get(0);
		System.out.println(num);
	}
}



