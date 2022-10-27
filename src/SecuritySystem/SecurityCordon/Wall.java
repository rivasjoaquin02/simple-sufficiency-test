package SecuritySystem.SecurityCordon;

public class Wall extends SecurityCordon {
    private final double thickness;
    private final String material;

    public Wall(double perimeter, double height, String status, double thickness, String material) {
        super(perimeter, height, status);
        this.thickness = thickness;
        this.material = material;
    }

    public double getThickness() {
        return thickness;
    }

    public String getMaterial() {
        return material;
    }
}
