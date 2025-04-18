public class Singer extends Person {

    private String bantName;

    public Singer(String name, String designation, String bantName) {
        super(name, designation);
        this.bantName = bantName;
    }

    public void singing() {
        System.out.println("singer is singing");
    }

    public void playGitar() {
        System.out.println("singer is playGitar");
    }

    @Override
    public void learn() {
        System.out.println("singer is learning");
    }

    @Override
    public void walk() {
        System.out.println("singer is walking");
    }

    @Override
    public void eat() {
        System.out.println("singer is eating");
    }

    public String getBantName() {
        return bantName;
    }

    @Override
    public String toString() {
        return " Dancer{" +
                " name: " + getName() + "," +
                " designation: " + getDesignation() + "," +
                " bantName ='" + bantName + '\'' +
                '}';
    }
}


