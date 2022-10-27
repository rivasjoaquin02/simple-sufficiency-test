package SecuritySystem.SecurityCheckpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SecurityCheckpointTest {

    /*
    @Test
    void getId() {
        var checkpoint = new SecurityCheckpoint(13, true, true, "bien" );
        assertEquals(13, checkpoint.getId());
    }
    */
    @Test
    void isIlluminated() {
        var checkpoint = new SecurityCheckpoint(true, true, "bien" );
        assertTrue(checkpoint.isIlluminated());
    }
    @Test
    void isHasPersonal() {
        var checkpoint = new SecurityCheckpoint(true, true, "bien" );
        assertTrue(checkpoint.isHasPersonal());
    }
    @Test
    void getStatus() {
        var checkpoint = new SecurityCheckpoint(true, true, "bien" );
        assertEquals("bien", checkpoint.getStatus());
    }
}