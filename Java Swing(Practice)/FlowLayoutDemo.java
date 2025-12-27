import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    JPanel panel;
    JScrollPane scroll;

    public FlowLayoutDemo() {
        super("Flow Layout Demo with Scroll Pane");
        this.setSize(1680,800);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setLayout(new GridLayout(0,15,40,40));

        scroll = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(0, 0,1660,750);

        for (int i = 0; i < 10000; i++) {
            JButton button = new JButton("" + (i + 1));
            panel.add(button);
        }

        this.add(scroll);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
