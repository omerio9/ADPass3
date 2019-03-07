
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;

public class TestClass {



    Account account1 = new Account();
    Account account2 = new Account();

    @Test
    public void testObjEquality() {
        assertEquals(account1,account2); //obj equality
    }


    @Test
    public void testObjIdentity() {
        assertSame(account1,account1); //obj identity
        }

    @Test
        public  void fail("Test will always fail") {

    }

   // @Ignore
 //   @Test(timeout = 1000) ///test timout



   //@Ignore
    //@Test                 //ignore test


}//end TestClass
