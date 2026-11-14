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
        Student s3 = new Student(1234657889);
        System.out.println(s3.roll);

        //copyconstructors
        // shallow copy constructors
        Student s4 = new Student();
            s4.name = "manan";
            s4.roll = 456;
            s4.password = "abc";
            s4.marks[0]=100;
            s4.marks[1]=90;
            s4.marks[2]=80;

        Student s5 = new Student(s4);
        s4.password = "opopop";
        
        //changing marks of s4
        s4.marks[2]=33;

        for(int i = 0 ; i <3 ;i++){
            System.out.println(s5.marks[i]);
        }


        //deeep copy constructor
        Student s6 = new Student();
            s6.name = "yashraj";
            s6.roll = 45226;
            s6.password = "abbbbc";
            s6.marks[0]=50;
            s6.marks[1]=60;
            s6.marks[2]=30;

        Student s7 = new Student(s6);
        s7.password = "opoporrrrrp";
        
        //changing marks of s6
        s6.marks[2]=43;

        for(int i = 0 ; i <3 ;i++){
            System.out.println(s7.marks[i]);
        }
        
        //inheritance 
        Fish shark = new Fish();
        shark.eat();

        //multilevel inheritance
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs= 4; 
        System.out.println(dobby.legs);

        //hierarchical inheritance
        //can run any of them check theory

        //polmorphism
        //method overloading 
        Calculator cal = new Calculator();
        
        System.out.println(cal.sum(6, 7));

        //method overrriding 

        Deer doi = new Deer();
        doi.eat();

        //abstraction
        //abstract class

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
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
    String password;
    int marks[];

    //parameterized
    Student(String name){
        this.name = name ;
        marks = new int[3];
    }

    Student(int roll){
        this.roll=roll;
        marks = new int[3];
    }
    //non-parameterized
    Student(){
        System.out.println("constructor is working!!!!!!!!!!1");
        marks = new int[3];
    }
    //copy constructor
    //shallow copy constructor
    // Student(Student s4){
    //     this.name = s4.name;
    //     this.roll = s4.roll;
    //     this.marks = s4.marks;
    // }
    //deep cpoy constructor
    Student(Student s6){
        this.name = s6.name;
        this.roll = s6.roll;
        marks = new int[3];
        for(int i = 0 ; i< marks.length;i++){
            this.marks[i] = s6.marks[i];
        }
    }
}

//inheritance


//base / parent classs
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

//child / derived classs

    // class Fish extends Animals{
    //     int fins;

    //     void swim(){
    //         System.out.println("swims in water");
    //     }

    // }

//mutlilevel inheritance
    // class Mammal extends Animals{
    //     int legs;

    // }

    class Dog extends Mammal{
        String breed;

    }

//hierarchial inheritance  and hybride

    class Mammal extends Animals{
        int legs;
            void walks (){
                System.out.println("walks");
            }

        }
    class Fish extends Animals{

        void swim(){
            System.out.println("swims");
        }

    }

    class Shark extends Fish{
        void teeth(){
            System.out.println("have teeth ");
        }
    }
    class Tuna extends Fish{
        void wings(){
            System.out.println("have wings");
        }
    }

    class Bird extends Animals{

        void fly(){
            System.out.println("fly");
        }

    }

    //polymorphism
    //method overloading 
    class Calculator {
        int sum(int a , int b){
            return a+b ; 
        } 
        float sum(float a , float b){
            return a+b ; 
        } 
        int sum(int a , int b , int c ){
            return a+b+c ; 
        } 
    } 

    //method overriding
    class Animal{
        void eat(){
            System.out.println("eats anything");
        }

    }
    class Deer extends Animal{
        void eat(){
            System.out.println("Eats grasss");
        }
    }

    //abstraction
    //abstract class
    abstract class Animala1{
        void eat (){
            System.out.println("animals_1 eats");
        }
        abstract void walk();
    } 
    class Horse extends Animala1{
        void walk (){
            System.out.println("walks on four legs");
        }
    }
    class Chicken extends Animala1{
        void walk(){
            System.out.println("walks on two legs");
        }
    }