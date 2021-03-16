package CoreJavaL2.jdbc;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			URL objURL = new URL("https://www.google.com");
			URLConnection objUrlConnection = objURL.openConnection();
			InputStream objInputStream = objUrlConnection.getInputStream();
			int iData;
			while ((iData = objInputStream.read()) != -1) {
				System.err.print((char) iData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
