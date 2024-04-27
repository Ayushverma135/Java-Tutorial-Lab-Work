class Student {
    String name;
    static String school;

    // public static void chamgeSchool(){
    //     school = "newschool"
    // }
}

public class Static {
    public static void main(String[] args) {
        Student.school = "xyz";
        Student s1=new Student();
        s1.name="tony";
        System.out.println(s1.school);
    }
}
