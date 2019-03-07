
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.fail;

public class TestClass {
    Account account1;
    Account account2 ;

    @Before
public void setUp(){
        account1=new Account("1","Mbadu",50);
        account2=new Account("2","Shawn",80);
    }


    @After
    public void tearDown(){

    }


    @Test
    public void testObjEquality() {
        assertEquals(account2,account2); //obj equality
        //expecting account2 & getting account2
    }


    @Test
    public void testObjIdentity() {
        assertSame(account2,account1); //obj identity
    //expecting account2 but getting account1
    }



    @Test(timeout = 1000) ///test timout
   public void testDepositMethod() {
        account1.depositCash(20.0);
    }


    @Ignore("METHOD NOT WORKING YET")
    @Test
    public void testWithdrawCashMethod(){
      account1.withdrawCash(500);
    }

      @Test
    public void testReadFile2() {
        try {
            FileReader reader = new FileReader("test.txt");
            reader.read();
            reader.close();
            fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            assertEquals(e.getMessage(),("test.txt (The system cannot find the file specified)"));
        }

    }

}//end TestClass
