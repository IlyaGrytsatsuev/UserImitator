import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Imitator {
    private  HttpURLConnection httpURLConnection;
    private  URL url;

    public Imitator(String s) throws MalformedURLException {
        url = new URL(s);
    }

    public void GetRequestImitation() throws IOException {
        httpURLConnection = (HttpURLConnection) url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        httpURLConnection.setRequestMethod("GET");

        if(responseCode == httpURLConnection.HTTP_OK){
            System.out.println("Get request is success !");
        }
        else
            System.out.println("Get request fail !");


    }

    public void PostRequestImitation() throws IOException {
        String name = "NewUser" + Math.random()*1000;
        String number = "" + Math.random()*10000;

        String parameters = "name=" + name + "&phone=" + number;

        httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        OutputStream os = httpURLConnection.getOutputStream();
        os.write(parameters.getBytes());
        os.flush();
        os.close();

        int responseCode = httpURLConnection.getResponseCode();

        if(responseCode == httpURLConnection.HTTP_OK){
            System.out.println("Post request is success !");
        }
        else
            System.out.println("Post request fail !");
    }
}

