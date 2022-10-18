public class Car {

    private Wheels wheels;

    private GearBox kpp;

    private Carcase carcase;

    private Motor motor;

    public Car(Wheels wheels, GearBox kpp, Carcase carcase, Motor motor) {
        this.wheels = wheels;
        this.kpp = kpp;
        this.carcase = carcase;
        this.motor = motor;
    }

    public void print(){
        wheels.print();
        kpp.print();
        carcase.print();
        motor.print();
    }






}
