public class Car extends Vehicule {
    // constructeurs
    public Car(String brand) {
        super(brand);
    }

    // methodappele
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum ! ";
    }

}