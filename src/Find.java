import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue May 07 16:40:31 CST 2019
 */



/**
 * @author Spring
 */
public class Find extends JFrame {
    public Find() {
        initComponents();
    }

    private void button2MouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        Un = new JTextField();
        age = new JTextField();
        button1 = new JButton();
        label5 = new JLabel();
        birthday = new JTextField();
        label6 = new JLabel();
        Email = new JTextField();
        label7 = new JLabel();
        callnum = new JTextField();
        button2 = new JButton();
        label8 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/Pictures/hand.jpg")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Find your password");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(150, 15), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u627e\u56de\u5bc6\u7801");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(190, 45, 65, 22);

        //---- label3 ----
        label3.setText("User name");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(30, 90), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("Cellphone number");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(30, 295), label4.getPreferredSize()));
        contentPane.add(Un);
        Un.setBounds(165, 85, 200, Un.getPreferredSize().height);
        contentPane.add(age);
        age.setBounds(165, 135, 200, age.getPreferredSize().height);

        //---- button1 ----
        button1.setText("FIND");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(75, 350), button1.getPreferredSize()));

        //---- label5 ----
        label5.setText("Birthday");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(40, 190), label5.getPreferredSize()));
        contentPane.add(birthday);
        birthday.setBounds(165, 185, 200, birthday.getPreferredSize().height);

        //---- label6 ----
        label6.setText("Email");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(50, 245), label6.getPreferredSize()));
        contentPane.add(Email);
        Email.setBounds(165, 235, 200, Email.getPreferredSize().height);

        //---- label7 ----
        label7.setText("Age");
        contentPane.add(label7);
        label7.setBounds(new Rectangle(new Point(50, 140), label7.getPreferredSize()));
        contentPane.add(callnum);
        callnum.setBounds(165, 290, 200, callnum.getPreferredSize().height);

        //---- button2 ----
        button2.setText("CANCEL");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(250, 350), button2.getPreferredSize()));

        //---- label8 ----
        label8.setText("text");
        label8.setIcon(new ImageIcon(getClass().getResource("/Pictures/10.png")));
        contentPane.add(label8);
        label8.setBounds(0, 0, 435, 415);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField Un;
    private JTextField age;
    private JButton button1;
    private JLabel label5;
    private JTextField birthday;
    private JLabel label6;
    private JTextField Email;
    private JLabel label7;
    private JTextField callnum;
    private JButton button2;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
