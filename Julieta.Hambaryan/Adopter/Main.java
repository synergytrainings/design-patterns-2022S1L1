public class Main {
    public static void main(String[] args) {

        Hiker hiker = new Hiker();
        Diver diver = new Diver();
        DiverAdopter diverAdopter = new DiverAdopter(diver);

        hiker.walkForward();
        hiker.walkBackward();
        hiker.captureWithCamera();

        diverAdopter.walkForward();
        diverAdopter.walkBackward();
        diverAdopter.captureWithCamera();

    }
}