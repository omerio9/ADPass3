import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DatabaseTest {


private Database db;
    @Before
    public void setUp(){
db=new Database();
    }


    @After
    public void tearDown(){

    }


    @Test
    public void testConnection(){
      boolean test_con=  db.connect();
        assertEquals(true,test_con);
    }

}
