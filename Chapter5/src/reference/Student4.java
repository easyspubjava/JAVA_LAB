package reference;

public class Student4 {

	int studentID;
	String studentName;
	Subject2 korean;
	Subject2 math;
	
	public Student4(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject2();
		math = new Subject2();
	}
	
	public void setKorean(String name, int score)
	{
		korean.setName(name);;
		korean.setScorePoint(score);;
	}
	
	public void setMath(String name, int score)
	{
		math.setName(name);;
		math.setScorePoint(score);
	}
	
	public void showStudentInfo()
	{
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
}
