
class Pen {

    // 1. Properties (Data members)
    String color;
    int tip;

    // 2. Setter methods (Assign values)
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    // 3. Display method (Show values)
    void display() {
        System.out.println("Pen color: " + color);
        System.out.println("Pen tip: " + tip);
    }
}

class Student{
    String name ; 
    int age;
    float percentage ;//cgpa

    void calcPercentage(int phy , int chem , int math){
        percentage = (phy + chem + math)/3;
    }
}

// 4. Main class (Program execution starts here)
public class OOPS {

    public static void main(String[] args) {

        // 5. Object creation
        Pen p1 = new Pen();

        // 6. Assign values using setter methods
        p1.setColor("Blue");
        p1.setTip(5);

        // 7. Display object data
        p1.display();
    }
}
