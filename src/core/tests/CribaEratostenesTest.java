package core.tests;

import core.CribaEratostenes;
import org.junit.Test;
import static org.junit.Assert.*;

public class CribaEratostenesTest {

    @Test
    public void testCribaGeneradaCorrectamente() {
        int  [] primos = CribaEratostenes.generaCriba(10);
        assertArrayEquals(new int[]{2,3,5,7},primos);
    }

    @Test
    public void testTopeMenorA2() {
        int  [] primos = CribaEratostenes.generaCriba(1);
        assertArrayEquals(new int[0], primos);
    }
}
