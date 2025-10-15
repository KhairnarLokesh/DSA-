public class ap {
    public static void main(String[] args) {
        Student s=new Student();
        s.name=("lokesh");
        s.schoolname="sharda";

        Student s1=new Student();
        System.out.println(s1.schoolname);
    }
}

class Student{
    String name;
    int rollno;
    static String schoolname;


    void setname(String name){
        this.name=name;
    }

    String getname(){
        return this.name;
    }
}
