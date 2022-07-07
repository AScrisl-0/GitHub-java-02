package scr;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Register extends JFrame{
    JLabel lblUserName=new JLabel("用户名：");
    JTextField txtUserName =new JTextField(10);
    JLabel lblPassword=new JLabel("密码：");
    JPasswordField txtPassword=new JPasswordField(10);
    JLabel lblSex=new JLabel("性别：");
    ButtonGroup group=new ButtonGroup();
    JRadioButton rbtMale=new JRadioButton("男",true);
    JRadioButton rbtFeMale=new JRadioButton("女",false);
    JLabel lblHobby =new JLabel("爱好：");
    JCheckBox cbxBasketball =new JCheckBox("篮球",true);
    JCheckBox cbxFootball =new JCheckBox("足球",true);
    JCheckBox cbxTableTennis =new JCheckBox("乒乓球",true);
    JLabel lblXueLi=new JLabel("学历：");
    JComboBox jbxXueLi=new JComboBox();
    JButton btnOk=new JButton("确定");
    JButton btnCancel=new JButton("取消");
    JPanel p=new JPanel();
    JPanel pJbxx=new JPanel();

    public Register(){
        pJbxx.setLayout(new GridLayout(0,4));
        pJbxx.add(lblUserName);
        pJbxx.add(txtUserName);
        pJbxx.add(lblPassword);
        pJbxx.add(txtPassword);
        txtPassword.setEchoChar('*');
        txtPassword.setText("abcd");
        pJbxx.add(lblSex);
        pJbxx.add(rbtMale);
        pJbxx.add(rbtFeMale);
        pJbxx.add(new JLabel());
        group.add(rbtMale);
        group.add(rbtFeMale);
        pJbxx.add(lblXueLi);
        pJbxx.add(jbxXueLi);
        pJbxx.add(new JLabel());
        pJbxx.add(new JLabel());
        jbxXueLi.addItem("博士");
        jbxXueLi.addItem("硕士");
        jbxXueLi.addItem("本科");
        jbxXueLi.addItem("专科");
        pJbxx.add(lblHobby);
        pJbxx.add(cbxBasketball);
        pJbxx.add(cbxFootball);
        pJbxx.add(cbxTableTennis);
        pJbxx.add(new JLabel());
        pJbxx.add(btnOk);
        pJbxx.add(btnCancel);
        pJbxx.add(new JLabel());
        p.add(pJbxx);
        add(p,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Register frame=new Register();
        frame.setTitle("用户注册");
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
