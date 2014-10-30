class ExceptionEx1 {
	public static void main(String[] args) 
	{
		try  {
			try	{	} catch (Exception e)	{ }
		} catch (Exception e)	{
			try	{	} catch (Exception e) { }	// 컴파일 에러 발생 !!!
		} // try-catch의 끝

		try  {

		} catch (Exception e)	{

		} // try-catch의 끝
	}	// main메서드의 끝
}