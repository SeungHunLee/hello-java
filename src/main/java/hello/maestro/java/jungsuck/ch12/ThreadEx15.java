 class ThreadEx15 {
	public static void main(String args[]) {
		ThreadEx15_1 th1 = new ThreadEx15_1();
		ThreadEx15_2 th2 = new ThreadEx15_2();

		th1.start();
		th2.start();

		try {
			th1.sleep(5000);	
		} catch(InterruptedException e) {}

		System.out.print("<<main 종료>>");
	} // main
}

class ThreadEx15_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx15_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	} // run()
}