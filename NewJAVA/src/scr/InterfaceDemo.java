package scr;

public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike=new Bike();
        Bus bus=new Bus();
        bike.start(1234);
        bike.stop(3456);
        bus.start(2345);
        bus.stop(4567);
    }
}
