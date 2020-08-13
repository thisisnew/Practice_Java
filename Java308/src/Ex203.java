import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex203 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("입력해주세요.");
		
		String answer = reader.readLine();
		
		System.out.println(answer);
	}
}
