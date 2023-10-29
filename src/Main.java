import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Main extends JPanel implements KeyListener {
    public Main() {
        addKeyListener(this);
    }


    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Fane", 30, "Plummer house", "CS");
        Teacher teacher2 = new Teacher("Amber", 30, "Oxford house", "ACS");
        Student student1 = new Student("Kung", 18, "The View", 80);

        teacher1.teach();
        teacher2.sleep();
        student1.learn();
        student1.walk();

        People p = new People();
        System.out.println(p.address);

        // Polymorphism
        People s1 = new Student("Fane", 30, "Plummer house", 80);
        People s2 = new Student("Joe", 32, "Taiwan", 60);

        People t1 = new Teacher("Amber", 28, "Taiwan", "Marketing");

        //array
//        People[] people = new People[10];
//        people[0] = s1;
//        people[1] = s2;
//        people[2] = t1;
//
//        for(int i = 0; i < 3; i++) {
//            System.out.println(people[i].name);
//        }

        //also can change to ArrayList
        ArrayList<People> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(t1);
        System.out.println(people.size());

// Animal, 這裡也算是一種polymorphism
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Editable chicken1 = new Chicken(); //use Interface

        dog1.makeSound();
        cat1.makeSound();

        System.out.println(chicken1.howToEat());

        //KeyListener
        JFrame window = new JFrame();
        window.setSize(500, 500);
        window.setContentPane(new Main());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}