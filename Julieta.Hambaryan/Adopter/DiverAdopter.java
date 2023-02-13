
public class DiverAdopter implements Traveler{
    Diver diver;

    public DiverAdopter(Diver diver){
        this.diver = diver;
    }

    @Override
    public void walkForward() {
        this.diver.swimForward();
    }

    @Override
    public void walkBackward() {
        this.diver.swimBackward();
    }

    @Override
    public void captureWithCamera() {
        this.diver.captureWithWaterproofCamera();
    }
}
