package SecuritySystem.Alarm;

public class Alarm {

    private final boolean exist;
    private final String status;

    public Alarm(boolean exist, String status) {
        this.exist = exist;
        status = status.toLowerCase();
        if (status.equals("bien") || status.equals("regular") || status.equals("mal"))
            this.status = status;
        else throw new IllegalArgumentException("Invalid Argument for Status");
    }

    public boolean isExist() {
        return exist;
    }

    public String getStatus() {
        return status;
    }
}
