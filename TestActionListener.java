import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class TestActionListener implements ActionListener {
    private int u = 100;

    public void actionPerformed(ActionEvent e) {
        System.out.println("Программа начнется в течении 3 сек.");
        try {
            Thread.sleep(3000);
        } catch (Exception c) {
            c.printStackTrace();
        }
        AutoClicker clicker = new AutoClicker();
        boolean t = true;
        while (t) {
            clicker.keyPress(KeyEvent.VK_ENTER);
            clicker.clickMouse(InputEvent.BUTTON1_MASK);
            clicker.keyPress(KeyEvent.VK_ENTER);
        }
    }
}