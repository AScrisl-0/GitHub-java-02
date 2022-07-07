package scr;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TriangleFrame extends JFrame{
    JLabel lblEdge1=new JLabel("边长1");
    JLabel lblEdge2=new JLabel("边长2");
    JLabel lblEdge3=new JLabel("边长3");
    JLabel lblArea=new JLabel("面积");
    JTextField txtEdge1=new JTextField(10);
    JTextField txtEdge2=new JTextField(10);
    JTextField txtEdge3=new JTextField(10);
    JTextField txtArea=new JTextField(10);
    JButton btnCalculate=new JButton("计算");
    JButton btnReset=new JButton("清空");
    JPanel p=new JPanel();

    public TriangleFrame(){
        super("计算机三角形面积");
        p.setLayout(new GridLayout(5,2));
        p.add(lblEdge1);p.add(txtEdge1);
        p.add(lblEdge2);p.add(txtEdge2);
        p.add(lblEdge3);p.add(txtEdge3);
        p.add(btnCalculate);p.add(btnReset);
        p.add(lblArea);p.add(txtArea);
        this.add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double a= Double.valueOf(txtEdge1.getText());
                double b= Double.valueOf(txtEdge2.getText());
                double c= Double.valueOf(txtEdge3.getText());
                if(!(a+b>c&&a+c>b&&b+c>a)){
                    JOptionPane.showMessageDialog(null,
                            "您输入的3个边长不能构成一个三角形",
                            "提示信息",JOptionPane.ERROR_MESSAGE);
                    return ;
                }
                Triangle triangle=new Triangle(a,b,c);
                txtArea.setText(String.valueOf(triangle.getArea()));
            }
        });
        btnReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtEdge1.setText("");
                txtEdge2.setText("");
                txtEdge3.setText("");
            }
        });
    }

    public static void main(String[] args) {
        TriangleFrame frame=new TriangleFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
class Triangle{
    private double a,b,c;
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getC(){
        return c;
    }
    public void setC(double c){
        this.c=c;
    }
    public Triangle(double a,double b,double c){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getArea(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
