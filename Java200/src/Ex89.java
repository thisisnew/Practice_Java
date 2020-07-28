import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex89 {
	public static void main(String[] args) {
		String url = "https://www.billboard.com/charts/the-billboard-hot-100";
		
		try {
			
			URLConnection urlConnection = new URL(url).openConnection();
	        urlConnection.addRequestProperty("User-Agent", "Mozilla");
	        urlConnection.setReadTimeout(5000);
	        urlConnection.setConnectTimeout(5000);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream(), "euc-kr"),8);
			String line = null;
			while ((line = reader.readLine()) != null) {
				if(!line.trim().equals("")) {
					System.out.println(line.trim());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR!!!");
		}
	}
}
