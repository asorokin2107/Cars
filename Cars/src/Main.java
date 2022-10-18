public class Main {

    public static void main(String[] args) {
        Wheels wheels = new Wheels(4);
        GearBox kpp = new GearBox(4, "автоматическую");
        Carcase carcase = new Carcase("Седан.");
        Motor motor = new Motor("Митсубиси Лансер", 6);

        Car car = new Car(wheels,kpp,carcase,motor);

        car.print();


    }

}
