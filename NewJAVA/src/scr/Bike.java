package scr;

public class Bike implements Vehicle{
    public void start(int x){
        System.out.println("自行车开始"+x);
    }
    public void stop (int y){
        System.out.println("自行车停止"+y);
    }
}
