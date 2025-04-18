public class Programmer extends Person {

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println("progremmer is coding");
    }

    @Override
    public void learn() {
        System.out.println("programmer is learning");
    }

    @Override
    public void walk() {
        System.out.println("programmer is walking");
    }

    @Override
    public void eat() {
        System.out.println("programmer is eating");
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                " name: " + getName() + "," +
                " designation: " + getDesignation() + "," +
                "companyName ='" + companyName + '\'' +
                '}';
    }
}
