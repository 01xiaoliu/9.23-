package Day_9_23;

public class Computer {
    public Usb run(String part){
        System.out.println("代码运行-");
        if ("Keyboard".equals(part)){
            return new Keyboard();
        }else if ("Mouse".equals(part)){
            return new Mouse();
        }else {
            System.out.println("有问题!");
            return null;
        }
    }
}
