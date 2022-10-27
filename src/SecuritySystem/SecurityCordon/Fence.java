package SecuritySystem.SecurityCordon;

public class Fence extends SecurityCordon{
    private final String wireType;
    private final boolean hasElectricity;

    public Fence(double perimeter, double height, String status, String wireType, boolean hasElectricity) {
        super(perimeter, height, status);
        //TODO: check wireType
        this.wireType = wireType;
        this.hasElectricity = hasElectricity;
    }

    public String getWireType() {
        return wireType;
    }

    public boolean isHasElectricity() {
        return hasElectricity;
    }
}
