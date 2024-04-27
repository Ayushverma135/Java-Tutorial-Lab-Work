class Pen{
    String color;
    String type;//ballpoint,gel,etc
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    //polymorphism in OOPS

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
    // public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }
    // Student(String name, int age){
    //  this.name=name;
    //  this.age=age;

    //  System.out.println("constructor is called");
    // }
    // Student(Student s2){
    //     this.name=s2.name;
    //      this.age=s2.age;
    // }
    // Student(){

    // }
}

class Shape{
    String color;
}

class Triangle extends Shape{

}
public class objectOriented {
    public static void main(String[] args) {
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";

        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.printColor();
        // pen2.printColor();
        // pen1.write();
        // Student s1=new Student();
        // s1.name="ayush";
        // s1.age=20;

        // Student s2=new Student(s1);
        // s2.printInfo();
        // s1.printInfo(s1.name,s1.age);
        Triangle t1=new Triangle();
        t1.color="red";
    }
    
}
