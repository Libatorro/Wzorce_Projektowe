package FlyweightPattern;

import java.awt.*;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class Line implements Shape {
    public Line() {
        System.out.println("Creating a Line  Object");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color color) {

        line.setColor(color);
        line.drawLine(x, y, width, height);
    }
}
