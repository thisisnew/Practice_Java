import java.util.Arrays;

public class Ex098 {
	public static void main(String[] args) {
		String[] arr1 = new String[] {"a","b","c"};
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		int result = Arrays.binarySearch(arr1, "a");
		int result2 = Arrays.binarySearch(arr1, "d");
		
		System.out.println(result);
		System.out.println(result2);
	}
}
