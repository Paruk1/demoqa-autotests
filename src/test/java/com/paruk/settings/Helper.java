package com.paruk.settings;

import com.sun.glass.events.KeyEvent;

import java.awt.*;

public class Helper {

    public static void zoomIn(int zoomInTimes) {
        try {
            Robot robot = new Robot();
            for (int i = 0; i < 3; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ADD);
                robot.keyRelease(KeyEvent.VK_ADD);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " ошибка при увеличении масштабирования");
        }
    }

    public static void zoomOut(int zoomOutTimes) {
        try {
            Robot robot = new Robot();
            for (int i = 0; i < zoomOutTimes; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " ошибка при уменьшении масштабирования");
        }
    }
}
