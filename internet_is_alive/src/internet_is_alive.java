import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.Properties;


public class internet_is_alive {
	
	
	
	 static HttpURLConnection connection = null;
	 static int code;
	
public int   Is_alive(String host)  {
	
	
	try {
        URL u = new URL(host);
       // Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.34.1.20", 8080));

        String url = host,
        	//	proxy = "10.34.1.20",   
        		proxy = "10.34.1.22",
        	       port = "8080";
        	URL server = new URL(url);
        	Properties systemProperties = System.getProperties();
        	systemProperties.setProperty("http.proxyHost",proxy);
        	systemProperties.setProperty("http.proxyPort",port);
        	HttpURLConnection connection = (HttpURLConnection)server.openConnection();
        //	connection.connect();

        
        
        
        
        
      // connection = (HttpURLConnection) u.openConnection();
      //  connection.setConnectTimeout(1000);
        connection.setRequestMethod("HEAD");
        code = connection.getResponseCode();
       
        System.out.println("" + code);
        // You can determine on HTTP return code received. 200 is success.
    } catch (MalformedURLException e) {
    	
        e.printStackTrace();
        return code=0;
       
    } catch (ProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return code=0;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return code=0;
	} finally {
        if (connection != null) {
            connection.disconnect();
        }
    }

	
	
	return code;
	
}
}