package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class GradeTest {
	
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;

	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) throws FileNotFoundException {

		GradeTest test = new GradeTest();
		test.creatSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //성적 결과 생성
		System.out.println(report); // 출력		
		
	}
	
	public void creatSubject(){
		
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
	}
	
	public void createStudent() throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new FileInputStream("studentinfo.txt"));
		
		String name;
		int id;
		int koreanScore;
		int mathScore;
		int majorCode;
		
		Student student = null;
		
		while(scanner.hasNextLine()) {
			
			name = scanner.next();
			id = scanner.nextInt();
			koreanScore = scanner.nextInt();
			mathScore = scanner.nextInt();
			majorCode = scanner.nextInt();
			
			if(majorCode == Define.KOREAN) {
				student = new Student(id, name, korean );
			}
			else if(majorCode == Define.MATH) {
				student = new Student(id, name, math );
			}
			else {
				System.out.println("전공 과목 오류 입니다");
				return;
			}
			
			goodSchool.addStudent(student);
			korean.register(student);
			math.register(student);
			addScoreForStudent(student, korean, koreanScore);
			addScoreForStudent(student, math, mathScore);
						
		}
		scanner.close();
	}
	
	//과목별 성적 입력
	public void addScoreForStudent(Student student, Subject subject, int point){
			
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
			
	}
}
