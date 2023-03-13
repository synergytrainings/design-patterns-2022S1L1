package CameraSetting;

public class PowerSettings {
    private boolean cameraOn;

    public PowerSettings(){
        this.cameraOn = false;
    }

    public void turnOnCamera(){
        this.cameraOn = true;
        System.out.println("Camera is on");
    }

    public void turnOffCamera(){
        System.out.println("Camera is getting off");
        this.cameraOn = false;
    }

    public boolean isCameraOn(){
        return this.cameraOn;
    }

}
