import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.print.DocFlavor;
import javax.swing.*;

//username那个框是用户名，pa1,2依次是密码，确认密码，要判断pa1,2是一样的，点了确认按钮就说出，注册成功
/**
 * @author Spring
 */
public class Registered extends JFrame {

    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {
        //	query("bob");
        insert("Spring", "1234",20,"Spring@niit.com.cn","China", "Haikou",131);
    }
//    private static void insert(String name, String pwd) {
//    }
    //添加新的用户信息name,pwd1,……
    private static void insert(String UserName, String Password, int Age,  String Email, String Country, String Adress, int Cellphone_number) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/LoginDB?characterEncoding=utf-8";
            String user = "root";
            String password = "1234";
            con = (Connection) DriverManager.getConnection(url, user, password);

            String sql = "insert into user(UserName,Password,Age,Birthday,Email,Country,Adress,Cellphone_number value(?,?,?,?,?,?,?,?)";
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.setString(1, UserName);
            pstm.setString(2, Password);
            pstm.setString(3, String.valueOf(Age));
            //pstm.setString(4, Birthday);
            pstm.setString(5,Email);
            pstm.setString(6,Country);
            pstm.setString(7, Adress);
            pstm.setString(8, String.valueOf(Cellphone_number));

            System.out.println(pstm);
            int row = pstm.executeUpdate();
            System.out.println("新增数据为:" + row + "条");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //通过用户名查询信息
//    private static void query(String name) {
//            Connection conn = null;
//            PreparedStatement pstm = null;
//            try {
//                //加载驱动
//                Class.forName("com.mysql.jdbc.Driver");
//                //建立连接
//                String url = "jdbc:mysql://localhost:3306/LoginDB?characterEncoding=utf-8";
//                String user = "root";
//                String password = "1234";
//                conn = (Connection) DriverManager.getConnection(url, user, password);
//                //获取数据库预编译对象
//                String sql = "select * from user where username = ?";
//                pstm = (PreparedStatement) conn.prepareStatement(sql);
//                pstm.setString(1, name);
//                ResultSet set = pstm.executeQuery();
//                System.out.println(sql);
//                while (set.next()) {
//                    int id = set.getInt("id");
//                    String uname = set.getString("username");
//                    String pwd = set.getString("password");
//                    // System.out.println("ID:" + id + ",用户名:" + uname + ",密码:" + pwd);
//                    JOptionPane.showMessageDialog(null, "ID:" + id + ",用户名:" + uname + ",密码:" + pwd);
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            } finally {
//                //关闭资源
//                if (conn != null) {
//                    try {
//                        conn.close();
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//                }
//                else if (pstm != null) {
//                    try {
//                        pstm.close();
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
  //  }

    public Registered() {
        initComponents();
        backgroundImg.requestFocus();
    }

    private void confirmMouseClicked(MouseEvent e) {
        // TODO add your code here
    //写代码，点了确认的话会出现什么结果，应该需要if，try catch
        //应该是一个要看两次输入的密码是否一样
        String p1,p2;
        p1=pw1.getText();
        p2=pw2.getText();
        if(p1.equals(p2))
        {
            Win w= new Win();
            w.setVisible(true);
            dispose();
        }
        else
        {
            Loss l= new Loss();
            l.setVisible(true);
            dispose();
        }

        insert("Spring", "1234",20,"Spring@niit.com.cn","China", "Haikou",131);

    }

    private void cancelMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void yearFocusGained(FocusEvent e) {
        if(year.getText().equals("xxxx")){
            year.setText("");
            year.setForeground(Color.black);
        }
        year.setDocument(new JTextFieldLimit(4));
    }

    private void monthFocusGained(FocusEvent e) {
        if(month.getText().equals("xx")){
            month.setText("");
            month.setForeground(Color.black);
        }
        month.setDocument(new JTextFieldLimit(2));
    }

    private void dayFocusGained(FocusEvent e) {
        if(day.getText().equals("xx")){
            day.setText("");
            day.setForeground(Color.black);
        }
        day.setDocument(new JTextFieldLimit(2));
    }

    private void callFocusGained(FocusEvent e) {
        if(call.getText().equals("xxxxxxxxxxx")){
            call.setText("");
            call.setForeground(Color.black);
        }
        call.setDocument(new JTextFieldLimit(11));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        pw1 = new JPasswordField();
        un = new JTextField();
        pw2 = new JPasswordField();
        button1 = new JButton();
        label6 = new JLabel();
        year = new JTextField();
        label7 = new JLabel();
        Email = new JTextField();
        label8 = new JLabel();
        Age = new JTextField();
        label9 = new JLabel();
        country = new JTextField();
        button2 = new JButton();
        label11 = new JLabel();
        label12 = new JLabel();
        Adress = new JTextField();
        call = new JTextField();
        label13 = new JLabel();
        month = new JTextField();
        label14 = new JLabel();
        label15 = new JLabel();
        day = new JTextField();
        backgroundImg = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/Pictures/hand.jpg")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("Registered");
            label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            label1.setForeground(Color.black);
            panel1.add(label1);
            label1.setBounds(145, 25, 80, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("\u6ce8\u518c");
            label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            label2.setForeground(Color.black);
            panel1.add(label2);
            label2.setBounds(new Rectangle(new Point(170, 50), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("User name");
            label3.setForeground(Color.black);
            panel1.add(label3);
            label3.setBounds(new Rectangle(new Point(30, 100), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("Password");
            label4.setForeground(Color.black);
            panel1.add(label4);
            label4.setBounds(new Rectangle(new Point(30, 140), label4.getPreferredSize()));

            //---- label5 ----
            label5.setText("confirm password");
            label5.setForeground(Color.black);
            panel1.add(label5);
            label5.setBounds(new Rectangle(new Point(10, 180), label5.getPreferredSize()));
            panel1.add(pw1);
            pw1.setBounds(150, 135, 205, pw1.getPreferredSize().height);
            panel1.add(un);
            un.setBounds(150, 95, 205, un.getPreferredSize().height);
            panel1.add(pw2);
            pw2.setBounds(150, 175, 205, pw2.getPreferredSize().height);

            //---- button1 ----
            button1.setText("Confirm");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    confirmMouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(50, 510), button1.getPreferredSize()));

            //---- label6 ----
            label6.setText("Tellphone number");
            label6.setForeground(Color.black);
            panel1.add(label6);
            label6.setBounds(new Rectangle(new Point(15, 425), label6.getPreferredSize()));

            //---- year ----
            year.setText("xxxx");
            year.setBackground(Color.black);
            year.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    yearFocusGained(e);
                }
            });
            panel1.add(year);
            year.setBounds(150, 215, 40, year.getPreferredSize().height);

            //---- label7 ----
            label7.setText("Email");
            label7.setForeground(Color.black);
            panel1.add(label7);
            label7.setBounds(new Rectangle(new Point(40, 305), label7.getPreferredSize()));
            panel1.add(Email);
            Email.setBounds(150, 295, 205, Email.getPreferredSize().height);

            //---- label8 ----
            label8.setText("Birthday");
            label8.setForeground(Color.black);
            panel1.add(label8);
            label8.setBounds(new Rectangle(new Point(35, 225), label8.getPreferredSize()));
            panel1.add(Age);
            Age.setBounds(150, 255, 205, 30);

            //---- label9 ----
            label9.setText("Age");
            label9.setForeground(Color.black);
            panel1.add(label9);
            label9.setBounds(new Rectangle(new Point(45, 260), label9.getPreferredSize()));
            panel1.add(country);
            country.setBounds(150, 335, 205, 30);

            //---- button2 ----
            button2.setText("Cancel");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    cancelMouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(225, 510), button2.getPreferredSize()));

            //---- label11 ----
            label11.setText("Country");
            panel1.add(label11);
            label11.setBounds(new Rectangle(new Point(35, 345), label11.getPreferredSize()));

            //---- label12 ----
            label12.setText("Adress");
            panel1.add(label12);
            label12.setBounds(new Rectangle(new Point(40, 385), label12.getPreferredSize()));
            panel1.add(Adress);
            Adress.setBounds(150, 375, 205, Adress.getPreferredSize().height);

            //---- call ----
            call.setText("xxxxxxxxxxx");
            call.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    callFocusGained(e);
                }
            });
            panel1.add(call);
            call.setBounds(150, 420, 210, call.getPreferredSize().height);

            //---- label13 ----
            label13.setText("Y");
            panel1.add(label13);
            label13.setBounds(195, 220, 15, label13.getPreferredSize().height);

            //---- month ----
            month.setText("xx");
            month.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    monthFocusGained(e);
                }
            });
            panel1.add(month);
            month.setBounds(220, 215, 35, month.getPreferredSize().height);

            //---- label14 ----
            label14.setText("M");
            panel1.add(label14);
            label14.setBounds(new Rectangle(new Point(265, 220), label14.getPreferredSize()));

            //---- label15 ----
            label15.setText("D");
            panel1.add(label15);
            label15.setBounds(325, 220, 25, label15.getPreferredSize().height);

            //---- day ----
            day.setText("xx");
            day.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    dayFocusGained(e);
                }
            });
            panel1.add(day);
            day.setBounds(285, 215, 30, day.getPreferredSize().height);

            //---- backgroundImg ----
            backgroundImg.setText("text");
            backgroundImg.setIcon(new ImageIcon(getClass().getResource("/Pictures/9.png")));
            panel1.add(backgroundImg);
            backgroundImg.setBounds(0, 0, 400, 585);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JPasswordField pw1;
    private JTextField un;
    private JPasswordField pw2;
    private JButton button1;
    private JLabel label6;
    private JTextField year;
    private JLabel label7;
    private JTextField Email;
    private JLabel label8;
    private JTextField Age;
    private JLabel label9;
    private JTextField country;
    private JButton button2;
    private JLabel label11;
    private JLabel label12;
    private JTextField Adress;
    private JTextField call;
    private JLabel label13;
    private JTextField month;
    private JLabel label14;
    private JLabel label15;
    private JTextField day;
    private JLabel backgroundImg;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
