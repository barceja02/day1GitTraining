package functional;

public class chatBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat m = new Chat();
		new human1(m);
		new human2(m);
	}

}

class human1 implements Runnable{
	Chat m;
	String [] s1 = {"Hi!", "how are you?", "Feeling great!"};
	
	public human1(Chat m1) {
		this.m = m1;
		new Thread (this, "Question").start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < s1.length; i++) {
			m.Question(s1[i]);
		}
	}
	
}

class human2 implements Runnable{
	Chat m;
	String [] s2 = {"Hello!", "Im fine, how about you?", "Wow. good for you"};
	
	public human2(Chat m2) {
		this.m = m2;
		new Thread (this, "Answer").start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < s2.length; i++) {
			m.Answer(s2[i]);
		}
	}
	
} 

class Chat{
	boolean flag = true;
	
	public synchronized void Question (String msg) {
		if (flag) {
			
			try {
				System.out.println(msg);
				flag = false;
				Thread.sleep(1000);
				notify();
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
	public synchronized void Answer (String msg) {
		if (!flag) {
			try {
				System.out.println(msg);
				flag = true;
				Thread.sleep(100);
				notify();
				wait();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			
		}
	}
} 