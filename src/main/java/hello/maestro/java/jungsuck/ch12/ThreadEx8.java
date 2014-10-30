import javax.swing.JOptionPane;

class ThreadEx8 {
	static boolean inputCheck = false;

	public static void main(String[] args) throws Exception 	{
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
	}
}

class ThreadEx8_1 extends Thread {
	public void run() {
		System.out.println("10초안에 값을 입력해야 합니다.");
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		ThreadEx8.inputCheck = true;
		System.out.println("입력값은 " + input + "입니다.");
	}
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=9; i >= 0; i--) {
			if(ThreadEx8.inputCheck) return;
			System.out.println(i);

			try {
				sleep(1000);
			} catch(InterruptedException e ) {}
		}
		System.out.println("10초 동안 값이 입력되지 않아 종료합니다.");
		System.exit(0);		
	}
}