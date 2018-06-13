package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
class Person implements Externalizable{
	
	String name;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}
	
}
*/

class Person2 implements Serializable{
	

	//private static final long serialVersionUID = -1503252402544036183L;

	/**
	 * 
	 */
	private static final long serialVersionUID = 8307928265648849333L;
	
	String name;
	String job;
	int i;
	int j;
	
	public Person2() {}

	public Person2(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
}

public class SerializationTest2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

	/*	Person2 personLee = new Person2("æ»¿ÁøÎ", "»∏¿Â¥‘");
		Person2 personAhn = new Person2("±Ë√∂ºˆ", "¥Î«•¿ÃªÁ");
		
		FileOutputStream fos = new FileOutputStream("serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(personLee);
		oos.writeObject(personAhn);
		oos.close();
		*/
		FileInputStream fis = new FileInputStream("serial2.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person2 p1 = (Person2)ois.readObject();
		Person2 p2 = (Person2)ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}
}
