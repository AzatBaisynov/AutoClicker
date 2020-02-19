import java.awt.*;
import java.awt.event.KeyEvent;

public class AutoClicker {
    private Robot robot;
    private int delay;

    public AutoClicker() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        delay = 300;
    }

    public void clickMouse(int button) {
      try {
          robot.mousePress(button);
          robot.delay(20);
          robot.mouseRelease(button);
          robot.delay(delay);
      } catch (Exception e) {
          e.printStackTrace();
      }
    }

    public void keyPress(int keycode) {
        try {
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDelay(int ms) {
        this.delay = ms;
    }
}
