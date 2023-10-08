import com.MyfirstVertexProjectVerticle.FirstVerticle;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstVerticleTest {

    @Test
    public void VertxIntroTest() throws Exception {
        System.out.println("Hey this is test only");
        FirstVerticle hello = new FirstVerticle();
        assertNull(null);
    }

    @Test
    public void addTest(){
        FirstVerticle test = new FirstVerticle();
        assertEquals(4,test.add(2,2));
    }

    @Test
    public void addTestTwo(){
        FirstVerticle test = new FirstVerticle();
        assertEquals(10,test.add(3,7));
    }

    @Test

    public void combineTest(){
        FirstVerticle test = new FirstVerticle();
        assertEquals("heyMan",test.combine("hey","Man"));
    }
}
