import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
public class URLReader {
	public static void main(String[] args) throws Exception {
		URL aajtak = new URL("https://www.aajtak.in");
		BufferedReader in=new BufferedReader(new InputStreamReader(aajtak.openStream()));
		String inputLine;
		while ((inputLine=in.readLine()) != null) {
			System.out.println(inputLine);
		}
		in.close();
	}
}