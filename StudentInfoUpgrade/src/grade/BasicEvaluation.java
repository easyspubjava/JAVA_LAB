package grade;

public  class BasicEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {
		String grade;
		
		if(point >=90 && point <=100)
			grade = "A";
		else if(point >=80 && point <=89)
			grade = "B";
		else if(point >=70 && point <=79)
			grade = "C";
		else if(point >=55 && point <=69)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}
