package chapter12.q5;

public class Student {
	
	String name;
	String id;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.id == std.id) 
				return true;
			else 
				return false;
		}
		return false;
	}

	@Override
	public String toString() {

		return id +":"+name;
	}
	
	
}
