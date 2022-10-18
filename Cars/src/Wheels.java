public class Wheels {
    private int wheels;


    public Wheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void print() {
        System.out.println("У автомобиля " + wheels + " колеса.");
    }
}
