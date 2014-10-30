import java.util.*;

class RandomEx3
{
	public static void main(String[] args) 
	{
		for(int i=0; i < 10;i++)
			System.out.print(getRand(5, 10)+",");
		System.out.println();

		int[] result = fillRand(new int[10], new int[]{ 2, 3, 7, 5});
		System.out.println(Arrays.toString(result));

		String[] result2 =  fillDistinctRand(new String[3], new String[]{"a","b", "c", "d", "e"});
		System.out.println(Arrays.toString(result2));
	}

	public static int[] fillRand(int[] arr, int from, int to) {
		for(int i=0; i < arr.length; i++) {
			arr[i] = getRand(from, to);
		}

		return arr;
	}

	public static int[] fillRand(int[] arr, int[] data) {
		for(int i=0; i < arr.length; i++) {
			arr[i] = data[getRand(0, data.length-1)];
		}

		return arr;
	}

	public static String[] fillDistinctRand(String[] arr, String[] data) {
		if (arr.length <= 0 || data.length <= 0) return arr;

		HashSet hs = new HashSet(arr.length);

		while(hs.size() < Math.min(arr.length,data.length)) {
			hs.add(data[getRand(0, data.length-1)]);
		}

		Object[] tmp = hs.toArray();

		for(int i=0; i < tmp.length; i++) {
			arr[i] = (String)tmp[i];
		}
		return arr;
	}

	public static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
	}	
}