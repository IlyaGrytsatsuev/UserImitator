import java.io.IOException;
import java.net.MalformedURLException;

public class PostImitatorThread extends Thread{

    private String url;
    private Imitator imitator;

    public PostImitatorThread(String s) throws MalformedURLException {
        url = s;
        imitator = new Imitator(url);
    }

    public void run()  {
        while (true) {

            try {
                imitator.PostRequestImitation();
                Thread.sleep(15000);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
