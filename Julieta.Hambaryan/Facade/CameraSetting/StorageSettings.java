package CameraSetting;

public class StorageSettings {
    private int storage = 256;

    public void savePhoto(int photoSize){
        if (this.storage - photoSize >= 0){
            this.storage -= photoSize;
            System.out.println("Photo is saved");
        }
    }

    public void freeStorage(int photoSize){
        this.storage += photoSize;
        System.out.println("Photo is deleted");
    }

    public boolean canSavePhoto(int photoSize){
        if (this.storage - photoSize >= 0){
            return true;
        }
        else{
            System.out.println("no space left");
            return false;
        }
    }
}
