public class Boat extends Vehicule {
    // constructeurs
    public Boat(String brand) {
        super(brand);
    }

    // methodappele
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou ! ";
    }

}