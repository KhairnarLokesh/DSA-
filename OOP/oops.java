public class  oops{
    public static void main(String[] args) {
        Pen p1=new Pen();//create the pen obj p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
    }
}
class Pen{
    //properties+function

    String color;
    int tip;

    void setcolor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}