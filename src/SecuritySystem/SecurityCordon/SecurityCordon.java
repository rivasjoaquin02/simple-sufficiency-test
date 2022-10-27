package SecuritySystem.SecurityCordon;

public class SecurityCordon {
    private final double perimeter;
    private final double height;
    private final String status;

    public SecurityCordon(double perimeter, double height, String status) {
        this.perimeter = perimeter;
        this.height = height;
        //TODO: check status
        this.status = status;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getHeight() {
        return height;
    }

    public String getStatus() {
        return status;
    }
}
