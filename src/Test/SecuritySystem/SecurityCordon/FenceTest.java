package SecuritySystem.SecurityCordon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FenceTest {

    @Test
    void getWireType() {
        var fence = new Fence(78.8, 69.9, "bien", "pua", true );
        assertEquals("pua", fence.getWireType());
    }
    @Test
    void isHasElectricity() {
        var fence = new Fence(78.8, 69.9, "bien", "pua", true );
        assertTrue(fence.isHasElectricity());
    }
}