package guru.springframework;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {



    @Test
    void testMultiplication(){
        Dollar A = new  Dollar(5);
        A.times(2);
        assertEquals(10, A.amount);

        Dollar B = new Dollar(20);
        B.times(3);
        assertEquals(60, B.amount);
    }

    @Test
    void testEquality() {
    assertEquals(new Dollar(5), new  Dollar(5));
    assertNotEquals(new  Dollar(5),new  Dollar(8));
    }
}


