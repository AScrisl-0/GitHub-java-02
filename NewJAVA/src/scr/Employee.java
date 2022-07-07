package scr;

public class Employee extends Role{
    private double salary;
    private static String ID;
    public Employee(){
        super("张三","20","男");
        System.out.println("Employee的无参构造");
    }
    public Employee(String name,String age,String sex ){
        super(name,age,sex);
        this.salary=salary;
    }
    public void play(){
        System.out.println(super.getName()+"沉浸在敲代码中");
    }
    public final void sing() {
        System.out.println(super.getName() + "努力在调试中");
    }
}
