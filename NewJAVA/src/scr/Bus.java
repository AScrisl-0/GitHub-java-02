package scr;

public class Bus implements Vehicle{
    public void start(int x){
        System.out.println("公交车开始"+x);
    }
    public  void stop (int y){
        System.out.println("公交车停止"+y);
    }
}
