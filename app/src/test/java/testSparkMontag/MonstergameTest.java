package testSparkMontag;
//import static org.junit.Assert.*;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestFactory;
//import org.junit.Before;

public class MonstergameTest {

    private Monster m;
    
    @BeforeEach
    public void setUp() throws Exception {
        m = new Monster();

    }
    @TestFactory
    public void testAngriff(){
        m.angriff(30);
        assertTrue(m.getGesundheit() == 70);

    }
    @TestFactory
    public void testGetGesundheit() {
        assertTrue(m.getGesundheit()==100);
    }
}
