class ThreadEx22 {
	public static void main(String args[]) {
		Data d = new Data();
		MyThreadEx22 t1 = new MyThreadEx22(d); 
		MyThreadEx22 t2 = new MyThreadEx22(d); 

		t1.start();
		t2.start();
	}
}

class Data {
	int iv = 0;
}

class MyThreadEx22 extends Thread
{
	Data d;
	
	MyThreadEx22(Data d) {
		this.d = d;
	}

	public void run() {
		int lv =0;

		while(lv < 3) {
			System.out.println(getName() + " Local Var:" + ++lv);  
			System.out.println(getName() + " Instance Var:" + ++d.iv);  
			System.out.println();  
		}
	} // run()
}