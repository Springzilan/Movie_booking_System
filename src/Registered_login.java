import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon May 06 17:56:51 CST 2019
 */

/**
 * @author Spring
 */
public class Registered_login extends JFrame {
    public Registered_login() {initComponents();
    }

    private void loginMouseClicked(MouseEvent e) {
        // TODO add your code here
        //写代码实现验证账号密码是否正确
        PreparedStatement pst;
        ResultSet rs;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");//使用java.lang.Class类的forName（）方法。括号里面是驱动的名，添加架包后，加载驱动

            //实现连接  Connection是一个对象
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginDB","root", "1234");

            String sql = "select * from User where UserName=? and Password=?";

            pst=con.prepareStatement(sql);
            pst.setString(1,t1.getText());
            pst.setString(2,new String(p1.getPassword()));

            rs=pst.executeQuery();

            if(t1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(this, "Empty User Name","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(p1.getPassword().length == 0)
            {
                JOptionPane.showMessageDialog(this, "Empty Password","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if (rs.next())
            {
                Show s= new Show();
                s.setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Incorrect User Name or Password","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception c)
        {
            JOptionPane.showMessageDialog(this, c);
        }
    }

    private void registeredMouseClicked(MouseEvent e) {
        //进入注册界面
        new Registered().setVisible(true);
    }

    private void cancelMouseClicked(MouseEvent e) {
        //点击取消
        this.dispose();

//        setVisible(false);
//        new Show();
    }

    private void findpwMouseClicked(MouseEvent e) {
        // 进入找回密码界面
        new Find().setVisible(true);
    }

    private void textField1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        t1 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();
        cancel = new JButton();
        p1 = new JPasswordField();
        label7 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/Pictures/hand.jpg")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("fly eye movie reservation system");
            label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            panel1.add(label1);
            label1.setBounds(135, 25, 250, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("\u98de\u773c\u7535\u5f71\u9884\u5b9a\u7cfb\u7edf");
            label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
            panel1.add(label2);
            label2.setBounds(190, 55, 130, 22);

            //---- label3 ----
            label3.setText("User Name");
            label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
            panel1.add(label3);
            label3.setBounds(30, 120, 83, label3.getPreferredSize().height);

            //---- label4 ----
            label4.setText("Password");
            label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
            panel1.add(label4);
            label4.setBounds(30, 175, 83, label4.getPreferredSize().height);

            //---- t1 ----
            t1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField1MouseClicked(e);
                }
            });
            panel1.add(t1);
            t1.setBounds(155, 120, 185, t1.getPreferredSize().height);

            //---- label5 ----
            label5.setText("Registered");
            label5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
            label5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    registeredMouseClicked(e);
                }
            });
            panel1.add(label5);
            label5.setBounds(405, 125, 83, 19);

            //---- label6 ----
            label6.setText("Find your password");
            label6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
            label6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    findpwMouseClicked(e);
                }
            });
            panel1.add(label6);
            label6.setBounds(365, 170, 130, 19);

            //---- button1 ----
            button1.setText("LOGIN");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    loginMouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(130, 285), button1.getPreferredSize()));

            //---- cancel ----
            cancel.setText("CANCEL");
            cancel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    cancelMouseClicked(e);
                }
            });
            panel1.add(cancel);
            cancel.setBounds(new Rectangle(new Point(300, 280), cancel.getPreferredSize()));
            panel1.add(p1);
            p1.setBounds(155, 170, 185, p1.getPreferredSize().height);

            //---- label7 ----
            label7.setIcon(new ImageIcon(getClass().getResource("/Pictures/8.jpg")));
            panel1.add(label7);
            label7.setBounds(-75, -10, 585, 390);

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
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registered_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registered_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registered_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registered_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registered_login relogin=new Registered_login();
                relogin.setLocationRelativeTo(null);
                relogin.setVisible(true);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField t1;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    private JButton cancel;
    private JPasswordField p1;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
