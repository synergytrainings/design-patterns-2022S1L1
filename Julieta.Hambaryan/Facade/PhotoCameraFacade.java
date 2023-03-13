import CameraSetting.*;

public class PhotoCameraFacade {

    private ColorSettings colorSettings;
    private FocusSettings focusSettings;
    private PowerSettings powerSettings;
    private StorageSettings storageSettings;

    PhotoCameraFacade() {
        this.colorSettings = new ColorSettings();
        this.focusSettings = new FocusSettings();
        this.powerSettings = new PowerSettings();
        this.storageSettings = new StorageSettings();
    }

    public void turnOnCamera() {
        this.powerSettings.turnOnCamera();
    }

    public void turnOffCamera() {
        this.powerSettings.turnOffCamera();
    }

    public Photo takePhoto(boolean withColor) {
        if (this.powerSettings.isCameraOn()) {
            Photo photo = new Photo(withColor);
            if (this.storageSettings.canSavePhoto(photo.getSize())) {
                this.focusSettings.setFocus();
                if(withColor){
                    this.colorSettings.addColors();
                }
                this.storageSettings.savePhoto(photo.getSize());
                return photo;
            }
        }
        return null;
    }

    public void deletePhoto(Photo photo) {
        if (this.powerSettings.isCameraOn() && photo != null) {
            this.storageSettings.freeStorage(photo.getSize());
            photo = null;
        }
    }
}
