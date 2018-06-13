package reference;

public class Student3 {

	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student3(){
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score)
	{
		korean.name = name;
		korean.scorePoint = score;
	}
	
	public void setMath(String name, int score)
	{
		math.name = name;
		math.scorePoint = score;
	}
}
