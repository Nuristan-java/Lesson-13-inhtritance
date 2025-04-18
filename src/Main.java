public class Main {
    public static void main(String[] args) {
        
        Programmer programmer = new Programmer("Nuristan", "Java developer", "Write code");
        System.out.println(programmer);
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();

        Dancer dancer = new Dancer("Michael Jackson", "dance", "feels his body");
        System.out.println(dancer);
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();

        Singer singer = new Singer("Lady Gaga", "sings", "voice");
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singing();
        singer.playGitar();
    }
}