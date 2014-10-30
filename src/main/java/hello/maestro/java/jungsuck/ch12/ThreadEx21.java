class ThreadEx21 {
	public static void main(String args[]) {
		RunnableImpl r = new RunnableImpl();
		Thread t1 = new Thread(r); 
		Thread t2 = new Thread(r); 

		t1.start();
		t2.start();
	}
}

class RunnableImpl implements Runnable {
	int iv = 0;

	public void run() {
		int lv =0;
		String name = Thread.currentThread().getName();
		
		while(lv < 3) {
			System.out.println(name + " Local Var:" + ++lv);  
			System.out.println(name + " Instance Var:" + ++iv);  
			System.out.println();  
		}
	} // run()
}