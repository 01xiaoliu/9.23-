package Day_9_23;

public class Test {
    public static void main(String[] args) {
        Day_9_23.Computer computer =new Computer();
        Usb usb = computer.run("Mous");
        if (usb==null){
            System.out.println("usb空");
            return;
        }
        usb.run();
    }
}
