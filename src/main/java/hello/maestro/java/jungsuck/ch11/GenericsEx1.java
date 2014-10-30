import java.util.*;

class Product {}
class Tv extends Product{}
class Audio extends Product{}

class GenericsEx1 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv>             tvList = new ArrayList<Tv>();

		productList.add(new Tv());
		productList.add(new Audio());

		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
//		printAll(tvList);        // 컴파일 에러가 발생한다.

		printAll2(productList); // ArrayList<Product>
		printAll2(tvList);       // ArrayList<Tv>
	}

	public static void printAll(ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}

//	public static void printAll2(ArrayList<? extends Product> list) {
	public static <T extends Product> void printAll2(ArrayList<T> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
