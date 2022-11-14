import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UserImitator {
    private final static String Geturl = "http://localhost:8080/Servlet13/PhoneBook";
    private final static String Posturl = "http://localhost:8080/Servlet13/AddPhone";

        public static void main(String[] args) throws IOException, InterruptedException {

            GetImitatorThread getThread = new GetImitatorThread(Geturl);
            PostImitatorThread postThread = new PostImitatorThread(Posturl);
            getThread.start();
            postThread.start();

        }



}
