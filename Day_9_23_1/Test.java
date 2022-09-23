package Day_9_23_1;

class Animal {
    public void eat() {
        System.out.println("动物在吃");
    }
}
    class Dog extends Animal{
        String name;
        public void eat(){
            System.out.println(name+"在吃");
        }
        public void run(){
            System.out.println(name+"在跑");
        }
    }
    class Cat extends Animal{
        public void eat(){

            System.out.println("在吃");
        }
        public void run(){
            System.out.println("在跑");
        }
    }

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
            System.out.println("可以强转");
            dog2.run();
        } else if (animal instanceof Cat) {
            Cat cat2 = (Cat) animal;
            System.out.println("可以强转");
        }

    }
}