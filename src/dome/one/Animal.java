package dome.one;
//抽象类
abstract class Animal {
    abstract void makeSound();
}
//接口
interface Runnable{
    void run();
}
class Dog extends Animal implements Runnable{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
    @Override
    public void run(){
        System.out.println("Dog runs");
    }
}