package test.data;

import static org.junit.jupiter.api.Assertions.*;

import main.data.Corrida;
import org.junit.jupiter.api.Test;


public class TestCorrida{

    @Test
    void test(){
        Corrida co = new Corrida("2", 6.4, "Joinville", "Navegantes",15.3, true);
        co.finalizaCorrida();
        assertEquals(true, co.isFinalizada());
    }
}
