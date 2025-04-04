public class Student {
    
    String name;
    int age;
    int roll;
    private int phn = 98765443;

    public Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    public Student(String name) {
        this.name = name;
    }

    public static void fun() {
        System.out.println("Yes he is funny");
    }
    public static void fun1() {
        System.out.println("DSA class");
    }
    
}
