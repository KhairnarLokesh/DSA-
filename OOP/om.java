public class om {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Lokesh");
    }
}
class Student{
    String name;
    int rollno;

    public Student(){
        System.out.println("this is the constructor is calling");
    }

    Student(String name){
        this.name=name;
         System.out.println("Student name constructor is calling: " + name);
    }
}
