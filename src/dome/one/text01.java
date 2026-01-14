package dome.one;

public class text01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("java");
        Person p1 = new Person("zhansan",10);
        p1.introduce();
        Person p2 = new Person("lisi",20);
        p2.introduce();
        Student s1 = new Student("lisi",10,"20180101",90);
        s1.introduce();
    }
}
