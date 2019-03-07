import org.junit.Test;

public class TestServer {
    Server server1;

    @Test(expected = Exception.class)
    public void testRunServer(){
        server1.runServer();
    }
}
