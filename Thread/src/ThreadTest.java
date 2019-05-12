
class MyThread implements Runnable{
	
	public void run() {
		
		for(int i = 0; i<=200; i++) {
			System.out.print(i + "\t");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("start");
		
		Thread th1 = new Thread(new MyThread());
		th1.start();
		
		MyThread mth = new MyThread();
		Thread th2 = new Thread(mth);
		th2.start();
		
		Runnable runnable =  new Runnable() {
			public void run() {
				System.out.println("Runnable Test");
			}
		};
		
		runnable.run();
				
		System.out.println("end");
	}
}


