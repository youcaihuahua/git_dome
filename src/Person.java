public class Person {
    String name;
    int age;
public Person(int a,String b){
    age = a;
    name = b;
}
    void introduce() {
        System.out.println("my name is " + name + ",i am " + age + " years old");
    }
}
