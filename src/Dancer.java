public class Dancer extends Person {

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("dancer is dancing");
    }

    @Override
    public void learn() {
        System.out.println("dancer is learning");
    }

    @Override
    public void walk() {
        System.out.println("dancer is walking");
    }

    @Override
    public void eat() {
        System.out.println("dancer is eating");
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return " Dancer{" +
                " name: " + getName() + "," +
                " designation: " + getDesignation() + "," +
                " groupName ='" + groupName + '\'' +
                '}';
    }
}


