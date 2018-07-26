package core.tests;

import core.CribaEratostenes;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CribaEratostenesTest {

    static int primos[];

    @BeforeClass
    public static void init(){
        int  [] primos = CribaEratostenes.generaCriba(10);
    }

    @Test
    public void testCribaGeneradaCorrectamente() {
        assertArrayEquals(new int[]{2,3,5,7},primos);
    }

    @Test
    public void testTopeMenorA2() {
        assertArrayEquals(new int[0], primos);
    }
}
