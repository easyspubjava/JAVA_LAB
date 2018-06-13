package inheritance2;

public class Subject {

	private int subjectId;
	private int subjectName;
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public int getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(int subjectName) {
		this.subjectName = subjectName;
	}

	public void showSubjectInfo() {
		System.out.println(subjectId + "," +subjectName);
	}
}
