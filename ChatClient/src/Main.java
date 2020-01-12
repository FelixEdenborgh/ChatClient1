import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        Client C = new Client();
        Server S = new Server();
        
      
        
        C.start();
        S.start();



    }
}
