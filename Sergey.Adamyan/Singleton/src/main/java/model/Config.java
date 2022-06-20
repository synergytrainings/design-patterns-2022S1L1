package model;

public class Config {

    private final String companyName;
    private final int lockerId;
    private final boolean status;

    public String getCompanyName() {
        return companyName;
    }

    public int getLockerId() {
        return lockerId;
    }

    public boolean isStatus() {
        return status;
    }

    public Config(int lockerId, boolean status, String companyName) {
        this.lockerId = lockerId;
        this.status = status;
        this.companyName = companyName;
    }
}
