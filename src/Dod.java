public class Dod extends Animal {
    public Dod(String name, double seight, String paroda, double price) {
        super(name, seight, paroda, price);
    }
   @Override
    public void nakeSound(){
       System.out.println("Gaf gaf gaf ");
   }
}
