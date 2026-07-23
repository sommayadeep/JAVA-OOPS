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

        pen1.printcolour();  // call the function of printcolour to print the pen1



        Pen pen2 = new Pen();
        pen2.colour = "black";
        pen2.type = "gel";

        pen2.printcolour(); // call the function of printcolour to print the pen2
    }
    
}
