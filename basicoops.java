class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("Output Something");
    }

    public void printcolour(){
        System.out.println(this.colour);  //this. is used for calling the colour part
    }
}


public class basicoops {
    public static void main(String aurgs[]){
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "ball pen";

        pen1.write();  // It print only "Output something"
    }
    
}
