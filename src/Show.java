import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon May 06 15:46:04 CST 2019
 */

/**
 * @author Spring
 */
public class Show extends JFrame {
    public Show() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        picture1 = new JLabel();
        picture2 = new JLabel();
        picture3 = new JLabel();
        picture4 = new JLabel();
        picture5 = new JLabel();
        picture6 = new JLabel();
        picture7 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        comboBox1 = new JComboBox<>();
        label8 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/Pictures/hand.jpg")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

            //---- picture1 ----
            picture1.setIcon(new ImageIcon(getClass().getResource("/Pictures/\u590d\u4ec7\u8005\u8054\u76df41_1.jpg")));
            panel1.add(picture1);

            //---- picture2 ----
            picture2.setIcon(new ImageIcon(getClass().getResource("/Pictures/\u4e0b\u4e00\u4efb\uff1a\u524d\u4efb1_1.jpg")));
            panel1.add(picture2);

            //---- picture3 ----
            picture3.setIcon(new ImageIcon(getClass().getResource("/Pictures/a mom\u2019s1_1.jpg")));
            panel1.add(picture3);

            //---- picture4 ----
            picture4.setIcon(new ImageIcon(getClass().getResource("/Pictures/\u5927\u4fa6\u63a2\u76ae\u5361\u4e181_1.jpg")));
            panel1.add(picture4);

            //---- picture5 ----
            picture5.setIcon(new ImageIcon(getClass().getResource("/Pictures/\u4f55\u4ee5\u4e3a\u5bb61_1.jpg")));
            panel1.add(picture5);

            //---- picture6 ----
            picture6.setIcon(new ImageIcon(getClass().getResource("/Pictures/\u8c03\u97f3\u5e081_1.jpg")));
            panel1.add(picture6);

            //---- picture7 ----
            picture7.setIcon(new ImageIcon(getClass().getResource("/Pictures/\u96ea\u66b41_1.jpg")));
            panel1.add(picture7);
        }
        contentPane.add(panel1);
        panel1.setBounds(10, 280, 770, 190);

        //---- label6 ----
        label6.setText("Welcome to our movie reservation system");
        label6.setFont(new Font("Fira Code Medium", Font.BOLD, 24));
        contentPane.add(label6);
        label6.setBounds(85, 20, 625, label6.getPreferredSize().height);

        //---- label7 ----
        label7.setText("your location");
        label7.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
        contentPane.add(label7);
        label7.setBounds(25, 90, 95, label7.getPreferredSize().height);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "\u534e\u9f99\u533a",
            "\u7f8e\u5170\u533a",
            "\u79c0\u82f1\u533a",
            "\u510b\u5dde\u5e02"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(new Rectangle(new Point(165, 85), comboBox1.getPreferredSize()));

        //---- label8 ----
        label8.setText("\u8fd9\uff0c\u6211\u5e94\u8be5\u52a0\u4e00\u4e2a\u641c\u7d22\uff0c\u8ba9\u4ed6\u4eec\u641c\u81ea\u5df1\u60f3\u770b\u7684\u7535\u5f71\uff0c\u6216\u8bb8\uff0c\u5509\uff0c\u8fd8\u662f\u8ba9\u4ed6\u4eec\u9009\uff1f");
        contentPane.add(label8);
        label8.setBounds(new Rectangle(new Point(160, 185), label8.getPreferredSize()));

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
    private JPanel panel1;
    private JLabel picture1;
    private JLabel picture2;
    private JLabel picture3;
    private JLabel picture4;
    private JLabel picture5;
    private JLabel picture6;
    private JLabel picture7;
    private JLabel label6;
    private JLabel label7;
    private JComboBox<String> comboBox1;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
