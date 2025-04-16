public class Animal {
    private String name;
    private double seight;
    private String paroda;
    private double price;

//    public Animal() {
//
//    }

    public Animal(String name, double seight, String paroda, double price) {
        this.name = name;
        this.seight = seight;
        this.paroda = paroda;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSeight() {
        return seight;
    }

    public void setSeight(double seight) {
        this.seight = seight;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void nakeSound() {
        System.out.println("Aktoh");
    }
}
