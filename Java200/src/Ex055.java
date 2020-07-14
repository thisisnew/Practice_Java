
public class Ex055 {
	public static void main(String[] args) {
		int[] mm = {0,1,2,3,4};
		print(mm);
		print(1);
		print(1, 2);
		print(1, 2 ,3);
		
	}
	
	public static void print(int ... mm) {
		
		for(int m: mm) {
			System.out.print(m + "\t");
		}
		
		System.out.println();
	}
}
