package Day_9_23_2;

class Person {
    private String name;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person per = (Person) obj;
            return this.name.equals(per.name);
        }
        return false;
    }
}
public class Test {
    public static void main(String[] args) {
        String a =new String("tianhe");
        String b =new String("tianhe");
        Person aa =new Person("titanic");
        Person bb =new Person("titanc");
        System.out.println(a.equals(b));
        System.out.println(aa.equals(bb));
        System.out.println(aa.equals(new Person("titanic")));
    }
}
