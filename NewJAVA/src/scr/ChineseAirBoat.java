package scr;

public class ChineseAirBoat implements IAirBoat{
    private String type;
    public ChineseAirBoat(String type){
        this.type=type;
    }
    public void sail(double speed){
        System.out.println("我的型号是："+type+";我能以："+speed+"的速度航行");
    }
    public void fly(double speed){
        System.out.println("我的型号是："+type+";我能以："+speed+"的速度飞行");
    }
    public static void  main(String[] args){
        IAirBoat airBoat=new ChineseAirBoat("蛟龙-600");
        airBoat.fly(1000);
        airBoat.sail(500);
        IShip ship=new ChineseAirBoat("蛟龙-500");
        ship.sail(400);
//        ship.notify(800);
    }
}
