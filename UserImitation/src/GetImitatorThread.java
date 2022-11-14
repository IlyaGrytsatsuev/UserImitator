import java.io.IOException;
import java.net.MalformedURLException;

public class GetImitatorThread extends Thread{

    private String url;
    private Imitator imitator;

    public GetImitatorThread(String s) throws MalformedURLException {
        url = s;
        imitator = new Imitator(url);
    }

    public void run(){
        while(true){
            try {
                imitator.GetRequestImitation();
                Thread.sleep(5000);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
