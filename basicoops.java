class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("Output Something");
    }
}


public class basicoops {
    public static void main(String aurgs[]){
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "ball pen";

        pen1.write();
    }
    
}
