class Student{
    String name;
    int age;
    
    // Student( String name, int age){
    //     this.name = name;
    //     this.age = age;

    // }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }





        Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}
public class copy {
    public static void main(String[] args){
        Student s1 = new Student();
            s1.name = "Deep";
            s1.age = 20;
        Student s2 = new Student(s1);
    
        s1.print();

    }
}
