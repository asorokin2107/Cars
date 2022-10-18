public class Motor {

    private String model;
    private int liters;

    public Motor(String model, int liters) {
        this.model = model;
        this.liters = liters;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public void print() {
        System.out.println("Мотор марки " + model + " объемом " + liters + " литров.");
    }
}
