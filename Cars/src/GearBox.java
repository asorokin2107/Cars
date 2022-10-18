public class GearBox {
    private int gear;
    private String akkp;


    public GearBox(int gear, String akkp) {
        this.gear = gear;
        this.akkp = akkp;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getAkkp() {
        return akkp;
    }

    public void setAkkp(String akkp) {
        this.akkp = akkp;
    }

    public void print() {
        System.out.println("Автомобиль имеет " + akkp + " " + gear + "-ех ступенчатую коробку передач.");
    }


}