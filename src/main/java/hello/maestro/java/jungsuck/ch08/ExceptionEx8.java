class ExceptionEx8 {
	public static void main(String[] args) 
	{
		try {
			throw new Exception();			
		} catch (Exception e)	{
			System.out.println("Exception이 발생했습니다.");
		}
	} // main메서드의 끝
}