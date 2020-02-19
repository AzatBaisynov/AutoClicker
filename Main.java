import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.event.InputEvent;
import java.lang.Thread;

public class Main {

    public static void main(String[] args) {
        JFrame autoclicker = new Window();
        autoclicker.setVisible(true);
        //задержка
        int delay = 50;
        System.out.println();

        System.out.println("Программа начнется в течении 5 сек.");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        AutoClicker clicker = new AutoClicker();
        clicker.setDelay(delay);
        System.out.println("program has completed");


    }
}
