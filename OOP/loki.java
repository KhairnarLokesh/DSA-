public class  loki{
    public static void main(String[] args) {
        // Pen p1=new Pen();//create the pen obj p1
        // p1.setcolor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(10);
        // System.out.println(p1.getTip());
        // p1.setcolor("Pink");
        // System.out.println(p1.getColor());

        Student s=new Student("lokesh");
        System.out.println(s.name);
    }
}


// class Pen{
//     //properties+function

//    private String color;
//    private int tip;

//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//        return this.tip;
//     }
 
//     void setcolor(String newColor){
//         this.color=newColor;
//     }

//     void setTip(int tip){
//         this.tip=tip;
//     }
// }

//Constructor

class Student{
    String name;
    int roll;

    public Student(String name) {
        this.name=name;
    }

    
}