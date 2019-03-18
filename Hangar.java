public class Hangar {
    public static void main(String[] args) {
        Car citroen = new Car("Citroen");
        Car tesla = new Car("Tesla");
        Boat caravelle = new Boat("Caravelle");
        Boat trimaran = new Boat("Trimaran");

        System.out.println(citroen.doStuff());
        System.out.println(tesla.doStuff());
        System.out.println(caravelle.doStuff());
        System.out.println(trimaran.doStuff());

    }

}