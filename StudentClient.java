public class StudentClient {
    public static void main(String[] args) {
        
        Student s = new Student("Aditya",20,26);

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.roll);
        s.fun();
    }
}
