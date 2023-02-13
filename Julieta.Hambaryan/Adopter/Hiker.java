public class Hiker implements Traveler {

    @Override
    public void walkForward() {
        System.out.println("walking forward");
    }

    @Override
    public void walkBackward() {
        System.out.println("walking backward");
    }

    @Override
    public void captureWithCamera() {
        System.out.println("Photo of nature");
    }
}
