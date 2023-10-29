public class People {
    protected String name;
    protected int age;
    protected String address;

    //default constructor
    public People(){
        this.name = "People";
        this.age = 0;
        this.address = "UK";
    }

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public void walk() {
        System.out.println("Waking...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
