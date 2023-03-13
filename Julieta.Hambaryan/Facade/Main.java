public class Main {
    public static void main(String[] args) {
        PhotoCameraFacade photoCamera = new PhotoCameraFacade();
        photoCamera.turnOnCamera();
        Photo myPhoto = photoCamera.takePhoto(true);
        photoCamera.deletePhoto(myPhoto);
        photoCamera.turnOffCamera();
    }
}