class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();
		fe = (FireEngine)car;		// 8번째 줄. 실행 시 에러가 발생한다.
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}