import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    Client client1;

    @Test(expected = Exception.class)
    public void testClient(){
        client1.runClient();
    }
}