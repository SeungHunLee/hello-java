class ThreadEx23 {
	public static void main(String args[]) {
		MyThreadEx23 t1 = new MyThreadEx23(); 
		MyThreadEx23 t2 = new MyThreadEx23(); 

		t1.start();
		t2.start();
	}
}

class MyThreadEx23 extends Thread
{
	int iv = 0;

	public void run() {
		int lv =0;

		while(lv < 3) {
			System.out.println(getName() + " Local Var:" + ++lv);  
			System.out.println(getName() + " Instance Var:" + ++iv);  
			System.out.println();  
		}
	} // run
}