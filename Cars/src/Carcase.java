public class Carcase {
    private String carcase;

    public Carcase(String carcase) {
        this.carcase = carcase;
    }

    public String getCarcase() {
        return carcase;
    }

    public void setCarcase(String carcase) {
        this.carcase = carcase;
    }

    public void print() {
        System.out.println("Тип кузова " + carcase);
    }
}
