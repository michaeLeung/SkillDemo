import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    @Test 
    public void multiplication(){
        assertEquals(2, SkillDemo.multiply(2, 4));
    }
}
