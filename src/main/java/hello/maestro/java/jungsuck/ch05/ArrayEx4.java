class ArrayEx4 { 
	public static void main(String[] args) 
	{ 
		// 45개의 정수값을 저장하기 위한 배열 생성. 
		int[] ball = new int[45];       

		// 배열의 각 요소에 1~45의 값을 저장한다. 
		for(int i=0; i < ball.length; i++)       
			ball[i] = i+1;    // ball[0]에 1이 저장된다.

		int temp = 0;  // 두 값을 바꾸는데 사용할 임시변수 
		int j = 0;      // 임의의 값을 얻어서 저장할 변수 

		// 배열에 저장된 값이 잘 섞이도록 충분히 큰 반복횟수를 지정한다. 
		// 배열의 첫 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다. 
		for(int i=0; i < 100; i++) {       
			j = (int)(Math.random() * 45); // 배열 범위(0~44)의 임의의 값을 얻는다. 

			temp = ball[0]; 
			ball[0] = ball[j]; 
			ball[j] = temp; 
		} 
		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for(int i=0; i < 6; i++) 
			System.out.print(ball[i]+" "); 
	} 
} 