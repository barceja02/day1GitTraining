package functional;

public class Threadstate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StatesThread rn1 = new StatesThread("thread-1");
		rn1.start();
		
		StatesThread rn2 = new StatesThread("thread-2");
		rn2.start();
	}


	
	

}


class StatesThread extends Thread{
	private String threadname = "";
	StatesThread(String a){
		this.threadname =a;
	}
	
	public void NewThread() {
		System.out.println("Creating Thread" + threadname);
	}
	
	public void run() {

		// TODO Auto-generated method stub

		System.out.println(threadname);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		NewThread();
		Runnable();

		existing();
	}

	public void existing() {
		System.out.println("Thread ended " + threadname );
	}
	
	public void Runnable() {
		System.out.println("Thread has started" + threadname);
	}
}