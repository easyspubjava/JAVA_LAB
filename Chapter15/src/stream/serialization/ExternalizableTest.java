package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{

	String name;
	
	public Dog() {}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name =in.readUTF();
	}
	
	public String toString() {
		return name;
	}
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog myDog = new Dog();
		myDog.name = "∏€∏€¿Ã";
		
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos; oos){
			oos.writeObject(myDog);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		
		System.out.println(dog);
	}
}
