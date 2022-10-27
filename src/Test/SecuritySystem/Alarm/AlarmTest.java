package SecuritySystem.Alarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void invalidStatusThrowsExcept(){
        assertThrows( IllegalArgumentException.class, () -> {
            var alarma = new Alarm(true, "some");
        });
    }
    @Test
    void correctExist(){
        var alarma = new Alarm(true, "bien");
        assertTrue(alarma.isExist());
    }
    @Test
    void correctStatusBien(){
        var alarma = new Alarm(true, "bien");
        assertEquals("bien", alarma.getStatus());
    }
    @Test
    void correctStatusBienUpperCase(){
        var alarma = new Alarm(true, "Bien");
        assertEquals("bien", alarma.getStatus());
    }
    @Test
    void correctStatusRegular(){
        var alarma = new Alarm(true, "regular");
        assertEquals("regular", alarma.getStatus());
    }
    @Test
    void correctStatusRegularUpperCase(){
        var alarma = new Alarm(true, "Regular");
        assertEquals("regular", alarma.getStatus());
    }
    @Test
    void correctStatusMal(){
        var alarma = new Alarm(true, "mal");
        assertEquals("mal", alarma.getStatus());
    }
    @Test
    void correctStatusMalUpperCase(){
        var alarma = new Alarm(true, "Mal");
        assertEquals("mal", alarma.getStatus());
    }

}