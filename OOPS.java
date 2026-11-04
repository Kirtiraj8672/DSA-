// 4. Main class (Program execution starts here)
public class OOPS {

    public static void main(String[] args) {

        // 5. Object creation created a pen object called p1
        Pen p1 = new Pen();

        // 6. Assign values using setter methods
        p1.setColor("Blue");
        p1.setTip(5);
        //or
        p1.color = "Yellow";
        p1.tip= 3;

        // 7. Display object data
        p1.display();

        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Kirtiraj Vansadiya";
        myAcc.setPassword("abcdefghi");

        //constructors
        Student s1 =new Student("kirti");
        System.out.println(s1.name);

        Student s2 = new Student();
    }
}

class Pen {

    // 1. Properties (Data members)
    String color;
    int tip;

    //setter
    // 2. Setter methods (Assign values)
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    //getter
    // 3. Display method (Show values)
    void display() {
        System.out.println("Pen color: " + color);
        System.out.println("Pen tip: " + tip);
    }
    //or
    String getColor(){
        return this.color;
    }


}

// class Student{
//     String name ; 
//     int age;
//     float percentage ;//cgpa

//     void calcPercentage(int phy , int chem , int math){
//         percentage = (phy + chem + math)/3;
//     }
// }

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

//constructors

class Student {
    String name;
    int roll;

    //parameterized
    Student(String name){
        this.name = name ;
    }

    //non-parameterized
    Student(){
        System.out.println("constructor is working!!!!!!!!!!1");
    }
}
