class Student{
    String name;
    int age;

    public static void printInfo(String name){
    System.out.println(name);
    }

    public static void printInfo(int age){
    System.out.println(age);
    }
    
    
}

public void main(String args[]){
    Student s1 = new Student();
    s1.name = "Deep";
    s1.age = 20;

    s1.printInfo(s1.name);

}
