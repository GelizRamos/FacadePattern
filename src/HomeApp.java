public class HomeApp {
    public static void main(String[] args) {

        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService airConditioning = new AirConditioning();

        HomeInterface facade = new HomeInterface(light, tv, airConditioning);

        System.out.println("Test 1: Turning ON All Home Services");
        facade.turnOnAll();
        System.out.println();
        System.out.println("Test 2: Turning OFF All Home Services");
        facade.turnOffAll();
    }
}