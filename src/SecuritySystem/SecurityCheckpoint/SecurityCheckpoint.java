package SecuritySystem.SecurityCheckpoint;

public class SecurityCheckpoint {
    private final boolean isIlluminated;
    private final boolean hasPersonal;
    private final String status;

    public SecurityCheckpoint(boolean isIlluminated, boolean hasPersonal, String status) {
        this.isIlluminated = isIlluminated;
        this.hasPersonal = hasPersonal;
        //TODO: check status
        this.status = status;
    }

    public boolean isIlluminated() {
        return isIlluminated;
    }

    public boolean isHasPersonal() {
        return hasPersonal;
    }

    public String getStatus() {
        return status;
    }
}
