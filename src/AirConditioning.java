public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioning: ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioning: OFF");
    }
}