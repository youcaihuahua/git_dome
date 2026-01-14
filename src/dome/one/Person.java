package dome.one;

public class Person {
    private String name;
    private int age;
    public Person(){}
public Person(String a,int b){name = a;age = b;}
    void introduce() {
        System.out.println("my name is " + name + ",i am " + age + " years old");}
    public String getName(){return name;}
    public void setName(String a){name  = a;}
    public int getAge(){return age;}
    public void setAge(int b){age = b;}
}
