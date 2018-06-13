package school;

import java.util.ArrayList;
import utils.Define;


public class Subject {
	private String subjectName;  //과목 이름
	private int subjectId;      // 과목 고유번호
	private int gradeType;      // 과목 평가 방법 기본은 A,B 방식
	
	//수강 신청한 학생 리스트
	//register() 메서드를 호출하면 리스트에 추가 됨
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String subjectName, int subjectId){
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;   //기본적으로 A, B 타입
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public void register(Student student){  //수강신청
		studentList.add(student);
	}
}