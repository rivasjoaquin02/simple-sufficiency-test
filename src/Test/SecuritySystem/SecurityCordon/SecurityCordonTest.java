package SecuritySystem.SecurityCordon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecurityCordonTest {

    /*
    @Test
    void getId() {
        var cordon = new SecurityCordon(13, 78.6, 69.9, "bien");
        assertEquals(13, cordon.getId());
    }
    */
    @Test
    void getPerimeter() {
        var cordon = new SecurityCordon(78.6, 69.9, "bien");
        assertEquals(78.6, cordon.getPerimeter());
    }
    @Test
    void getHeight() {
        var cordon = new SecurityCordon(78.6, 69.9, "bien");
        assertEquals(69.9, cordon.getHeight());
    }
    @Test
    void getStatus() {
        var cordon = new SecurityCordon(78.6, 69.9, "bien");
        assertEquals("bien", cordon.getStatus());
    }
}