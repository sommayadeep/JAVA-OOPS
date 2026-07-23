class Student{
    String name;
    int age;
    
    Student( String name, int age){
        this.name = name;
        this.age = age;

    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class nperameterised {
    public static void main(String[] args){
        Student s1 = new Student("Deep" , 21);
    
        s1.print();

    }
}
