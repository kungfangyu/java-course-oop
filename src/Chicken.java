public class Chicken extends Animal implements Editable{

    public Chicken() {
        super("Chicken");
    }
    @Override
    public void makeSound() {
        System.out.println("Cluck!");
    }


    @Override
    public String howToEat() {
        return "Eat with oil.";
    }
}
