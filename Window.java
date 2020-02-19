import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window() {
        super("АвтоКликер by Azat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        setSize(300,80);
        JButton play = new JButton("старт");
        play.setMnemonic('F');
        ActionListener actionListener = new TestActionListener();
        play.addActionListener(actionListener);
        JButton stop = new JButton("                 СТОП                  ");
        stop.setMnemonic('S');
        container.add(stop);
        container.add(play);
    }
}