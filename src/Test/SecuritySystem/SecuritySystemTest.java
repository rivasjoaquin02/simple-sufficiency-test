package SecuritySystem;

import SecuritySystem.Alarm.Alarm;
import SecuritySystem.SecurityCheckpoint.SecurityCheckpoint;
import SecuritySystem.SecurityCordon.Fence;
import SecuritySystem.SecurityCordon.Wall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SecuritySystemTest {

    /*
    @Test
    void addGetSecurityCordons() {
        var system = new SecuritySystem();
        system.addSecurityCordons(
                new Fence(78.8, 69.9, "bien", "pua", true),
                new Wall(78.8, 69.9, "bien", 89.7, "concreto"),
                new Fence(78.8, 69.9, "bien", "pua", true),
                new Wall(78.8, 69.9, "bien", 78.6, "marmol"));
    }
    @Test
    void addSecurityCheckpoints() {
    }

    @Test
    void addAlarms() {
    }
    */

    @Test
    void numberFencesWithElectricity() {
        var system = new SecuritySystem();
        system.addSecurityCordons(
                new Fence(78.8, 69.9, "bien", "pua", true),
                new Wall(78.8, 69.9, "bien", 89.7, "concreto"),
                new Fence(78.8, 69.9, "bien", "pua", false),
                new Wall(78.8, 69.9, "bien", 78.6, "marmol"));
        assertEquals( 1 , system.numberFencesWithElectricity() );
    }
    @Test
    void numberWallsWithThicknessGreaterThan() {
        var system = new SecuritySystem();
        system.addSecurityCordons(
                new Fence(78.8, 69.9, "bien", "pua", true),
                new Wall(78.8, 69.9, "bien", 89.7, "concreto"),
                new Fence(78.8, 69.9, "bien", "pua", false),
                new Wall(78.8, 69.9, "bien", 78.6, "marmol"));
        assertEquals( 1 , system.numberWallsWithThicknessGreaterThan(80) );
    }
    @Test
    void getHeightCordonWithId() {
        var system = new SecuritySystem();
        system.addSecurityCordons(
                new Fence(78.8, 69.9, "bien", "pua", true),
                new Wall(78.8, 45.5, "bien", 89.7, "concreto"),
                new Fence(78.8, 6.6, "bien", "pua", false),
                new Wall(78.8, 80.2, "bien", 78.6, "marmol"));
        assertEquals( 6.6 , system.getHeightCordonWithId(3) );
    }
    @Test
    void getPerimeterCordonWithId() {
        var system = new SecuritySystem();
        system.addSecurityCordons(
                new Fence(78.8, 69.9, "bien", "pua", true),
                new Wall(2.5, 45.5, "bien", 89.7, "concreto"),
                new Fence(45.2, 6.6, "bien", "pua", false),
                new Wall(13.5, 80.2, "bien", 78.6, "marmol"));
        assertEquals( 13.5 , system.getPerimeterCordonWithId(4) );
    }
    @Test
    void getNumberCheckpointsWithoutIllumination() {
        var system = new SecuritySystem();
        system.addSecurityCheckpoints(
                new SecurityCheckpoint(true, true, "bien"),
                new SecurityCheckpoint(false, true, "mal"),
                new SecurityCheckpoint(true, false, "regular")
        );
        assertEquals( 1 , system.getNumberCheckpointsWithoutIllumination() );
    }
    @Test
    void getNumberCheckpointsNotCovered() {
        var system = new SecuritySystem();
        system.addSecurityCheckpoints(
                new SecurityCheckpoint(true, false, "bien"),
                new SecurityCheckpoint(false, true, "mal"),
                new SecurityCheckpoint(true, false, "regular")
        );
        assertEquals( 2 , system.getNumberCheckpointsNotCovered() );
    }
    @Test
    void getIdsCheckpointsWithoutIllumination() {
        var system = new SecuritySystem();
        system.addSecurityCheckpoints(
                new SecurityCheckpoint(true, false, "bien"),
                new SecurityCheckpoint(false, true, "mal"),
                new SecurityCheckpoint(true, false, "regular")
        );
        assertArrayEquals( new Integer[]{2} , system.getIdsCheckpointsWithoutIllumination() );
    }
    @Test
    void getIdsCheckpointsNotCovered() {
        var system = new SecuritySystem();
        system.addSecurityCheckpoints(
                new SecurityCheckpoint(true, false, "bien"),
                new SecurityCheckpoint(false, true, "mal"),
                new SecurityCheckpoint(true, false, "regular")
        );
        assertArrayEquals( new Integer[]{1,3} , system.getIdsCheckpointsNotCovered() );
    }
    @Test
    void getNumberMissingAlarms() {
        var system = new SecuritySystem();
        system.addAlarms(
                new Alarm(true, "mal"),
                new Alarm(false, "regular"),
                new Alarm(false, "bien"),
                new Alarm(true, "mal")
        );
        assertEquals( 2 , system.getNumberAlarmsMissing() );
    }
    @Test
    void getNumberAlarmsDontWork() {
        var system = new SecuritySystem();
        system.addAlarms(
                new Alarm(true, "mal"),
                new Alarm(false, "regular"),
                new Alarm(false, "mal"),
                new Alarm(true, "mal")
        );
        assertEquals( 3 , system.getNumberAlarmsDontWork() );
    }
}