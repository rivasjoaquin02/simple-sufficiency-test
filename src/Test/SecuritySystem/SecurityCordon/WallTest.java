package SecuritySystem.SecurityCordon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WallTest {

    @Test
    void getThickness() {
        var wall = new Wall(78.8, 69.9, "bien", 41, "concreto");
        assertEquals(41, wall.getThickness());
    }
    @Test
    void getMaterial() {
        var wall = new Wall(78.8, 69.9, "bien", 41, "concreto");
        assertEquals("concreto", wall.getMaterial());
    }
}