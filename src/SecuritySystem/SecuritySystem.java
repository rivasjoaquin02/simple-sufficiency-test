package SecuritySystem;

import SecuritySystem.Alarm.Alarm;
import SecuritySystem.SecurityCheckpoint.SecurityCheckpoint;
import SecuritySystem.SecurityCordon.Fence;
import SecuritySystem.SecurityCordon.SecurityCordon;
import SecuritySystem.SecurityCordon.Wall;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class SecuritySystem {
    private final LinkedHashMap <Integer, SecurityCordon> securityCordonsLHM;
    private final LinkedHashMap <Integer, SecurityCheckpoint> securityCheckpointsLHM;
    private final HashSet <Integer> idsCheckpointsWithoutIllumination;
    private final HashSet <Integer> idsCheckpointsNotCovered;
    private final LinkedHashMap <Integer, Alarm> alarmsLHM;
    private int numberAlarmsDontWork;
    private int numberAlarmsMissing;

    public SecuritySystem() {
        securityCordonsLHM = new LinkedHashMap<>();
        securityCheckpointsLHM = new LinkedHashMap<>();
        alarmsLHM = new LinkedHashMap<>();
        idsCheckpointsWithoutIllumination = new HashSet<>();
        idsCheckpointsNotCovered = new HashSet<>();
        numberAlarmsDontWork = 0;
        numberAlarmsMissing = 0;
    }

    /* adds */
    public void addSecurityCordons(SecurityCordon... cordons){
        for (SecurityCordon scI: cordons)
            securityCordonsLHM.put( securityCordonsLHM.size()+1 , scI );
    }
    public void addSecurityCheckpoints(SecurityCheckpoint... checkpoints){
        for (SecurityCheckpoint scI: checkpoints){
            int id = securityCheckpointsLHM.size()+1;
            securityCheckpointsLHM.put( id , scI );
            if (!scI.isIlluminated()) idsCheckpointsWithoutIllumination.add(id);
            if (!scI.isHasPersonal()) idsCheckpointsNotCovered.add(id);
        }

    }
    public void addAlarms(Alarm... alarms){
        for (Alarm aI: alarms){
            alarmsLHM.put( alarmsLHM.size()+1, aI );
            if (aI.getStatus().equals("mal")) numberAlarmsDontWork++;
            if (!aI.isExist()) numberAlarmsMissing++;
        }
    }

    /* info SecurityCordons */
    public int numberFencesWithElectricity(){
        int cnt=0;
        for (Integer key : securityCordonsLHM.keySet()) {
            var obj = securityCordonsLHM.get(key);
            if (obj instanceof Fence fI)
                cnt = fI.isHasElectricity() ? +1 : cnt;
        }
        return cnt;
    }
    public int numberWallsWithThicknessGreaterThan(int thickness){
        int cnt=0;
        for (Integer key : securityCordonsLHM.keySet()) {
            var obj = securityCordonsLHM.get(key);
            if (obj instanceof Wall wI)
                cnt = wI.getThickness() > thickness ? +1 : cnt;
        }
        return cnt;
    }
    public double getHeightCordonWithId(int id){
        return securityCordonsLHM.get(id).getHeight();
    }
    public double getPerimeterCordonWithId(int id){
        return securityCordonsLHM.get(id).getPerimeter();
    }


    /* info Checkpoints */
    public int getNumberCheckpointsWithoutIllumination(){
        return idsCheckpointsWithoutIllumination.size();
    }
    public int getNumberCheckpointsNotCovered(){
        return idsCheckpointsNotCovered.size();
    }
    public Integer[] getIdsCheckpointsWithoutIllumination() {
        return idsCheckpointsWithoutIllumination.toArray(new Integer[0]);
    }
    public Integer[] getIdsCheckpointsNotCovered() {
        return idsCheckpointsNotCovered.toArray(new Integer[0]);
    }

    /* info Alarms */
    //public int getNumberAlarmsTheyNeed(){}
    public int getNumberAlarmsMissing() {
        return numberAlarmsMissing;
    }
    public int getNumberAlarmsDontWork() {
        return numberAlarmsDontWork;
    }
}
