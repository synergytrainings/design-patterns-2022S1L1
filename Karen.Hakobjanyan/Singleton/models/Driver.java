package Singleton.models;

public class Driver {
    private String fName;
    private String lName;
    private byte age;
    private String license;

    public Driver(String fName, String lName, byte age, String license) throws Exception {
        this.fName = fName;
        this.lName = lName;
        this.license = license;
        if(age > 18){
            this.age = age;
        }else {
            throw new Exception("Age must be more than 18");
        }
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) throws Exception {
        if(age > 18){
            this.age = age;
        }else {
            throw new Exception("Age must be more than 18");
        }

    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
