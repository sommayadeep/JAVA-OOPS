class A{
    int i;
    int j;
    A(){
        i=0;
        j=0;
    }
    A(int i, int j){
        this.i=i;
        this.j=j;
    }
    void show(){
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
class B extends A{
    int k;
    B(int i, int j, int k){
        super(i,j);
        this.k=k;
    }
    void showk(){
        System.out.println("k="+k);
    }
}
public class inheritance{
    public static void main (String[] args){
        B b1 = new B(30,40,50);
        b1.showk();
        b1.show();
    }
}