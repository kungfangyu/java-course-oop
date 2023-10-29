public class Student extends People{
    private int grades;

    public Student(String name, int age, String address, int grades) {
        super(name, age, address);
        //if children doesn't invoke super() , it will run the default
        this.grades = grades;
    }

    public void learn() {
        System.out.println("Learning "+ grades);
    }

    @Override //會覆蓋掉原本在父層的method
    public void walk(){
        System.out.println("A Student is walking");
    }
}
