import java.util.*; 

class StringTokenizerEx4 { 
	public static void main(String args[]) { 
		String input = "삼십만삼천백십오"; 

		System.out.println(input); 
		System.out.println(hangulToNum(input)); 
	} 

	// 한글을 숫자로 바꾸는 메서드
	public static long hangulToNum(String input) { 
		long result = 0; 
		long tmpResult = 0; 
		long num = 0; 

		final String NUMBER ="영일이삼사오육칠팔구"; 
		final String UNIT = "십백천만억조"; 
		final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long)Math.pow(10, 8),(long)Math.pow(10, 12)}; 

		StringTokenizer st = new StringTokenizer(input, UNIT, true); 

		while(st.hasMoreTokens()) { 
			String token = st.nextToken(); 
                   // 숫자인지, 단위(UNIT)인지 확인한다.
			int check = NUMBER.indexOf(token);	

			if(check==-1) { // 단위인 경우
				if("만억조".indexOf(token)==-1) { 
					tmpResult += ( num!=0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)]; 
				} else {	
					tmpResult += num; 
					result += (tmpResult!=0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0; 
				} 
				num = 0; 
			} else {  // 숫자인 경우
				num = check; 
			} 
		} // end of while 

		return result + tmpResult + num; 
	} 
} 