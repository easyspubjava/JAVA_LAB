package grade;

public class MajorEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {
		String grade;
		if(point >=95 && point <=100)
			grade = "S";
		else if(point >=90 && point <=94)
			grade = new String("A");
		else if(point >=80 && point <=89)
			grade = "B";
		else if(point >=70 && point <=79)
			grade = "C";
		else if(point >=60 && point <=69)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}
