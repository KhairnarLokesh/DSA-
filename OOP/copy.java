public class copy {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Lokesh";
        s1.roll=123;
        s1.password="abc";

        Student s2=new Student();

    }


}

class Student{

     String name;
    int roll;
    String password;


    //copy construuctor
   Student(Student s1){
    this.name=s1.name;
    this.roll=s1.roll;
    this.password=s1.password;
   }

 
Student(){
   System.out.println("constructor is called");

}

Student(String name){
    this.name=name;
}
}