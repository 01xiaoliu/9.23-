package Day_9_23_2;

class Student{
    private String name;
    public Student(){
    }
    public Student(String name){
        this.name=name;
    }
    public String toString(){//toString往往返回的是属性的拼接字符串
        return name;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Student student=new Student("Liu");
        System.out.println(student);
        String string =new String("Li");
        System.out.println(string.toString());
    }
}
