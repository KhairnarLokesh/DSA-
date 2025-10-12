public class oops{
    public static void main(String[] args) {
        Pen p1=new Pen();//created a pen object named p1
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
       
        

    }
}

class Pen{
    //prop+fun
    String color;
    int tip;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return  this.tip;
    }

    void setcolor(String newcolor){
        this.color=newcolor;
    }

    void settip(int tip){
        this.tip=tip;
    }
}