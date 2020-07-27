
public class Ex079 {
	public static void println(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("[" + arr[i][j]+"]");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("---2차원배열방법1---");
		int[][] a = new int[4][3];
		
		a[0][0] = 1;
		a[0][1] = 2;
		println(a);
		
		System.out.println("2차원배열방법2");
		
		int[][] b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[5];
		b[2] = new int[3];
		
		println(b);
		
		System.out.println("2차원배열방법3");
		int[][] c = new int[][] {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,10}};
		println(c);
		
		System.out.println("2차원배열방법4");
		int[][] d = {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,10}};
		println(d);
		
		System.out.println("copy1");
		int[][] e = new int[c.length][c[0].length];
		for(int i = 0; i<c.length; i++) {
			System.arraycopy(c[i], 0, e[i], 0, e[i].length);
		}
		
		println(e);
				
	}
	
}
