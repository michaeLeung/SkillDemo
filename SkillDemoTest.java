import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    @Test 
    public void multiplication(){
        assertEquals(8, SkillDemo.multiply(2, 4));
    }
}
