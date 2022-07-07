package scr;

public class Test {
    public static void main(String[] args) {
        Role role=new Employee();
        role.play();
        Employee employee=(Employee) role;
        employee.sing();
        Manager manager=new Manager();
        System.out.println(Manager.vehicle);
    }
}