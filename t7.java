package SoftwareEngineering;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class infomation extends JFrame{
    private JLabel address, time, name, menu;
    public infomation () {
        this.setTitle("帳單");
        this.setLayout(null);
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        name = new JLabel("餐廳名字: .....");
        name.setBounds(75, 25, 100, 100);
        add(name);

        time = new JLabel("營業時間: 11:00 ~ 21:00");
        time.setBounds(75, 125, 100, 100);
        add(time);

        address = new JLabel("地址: ...............");
        address.setBounds(75, 175, 100, 100);
        add(address);

        menu = new JLabel("菜單: ........\n........\n.......");
        menu.setBounds(75, 225, 100, 100);
        add(menu);
    }
}
