package FlyweightPattern;

import java.awt.*;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class Owal implements Shape {

    private  boolean isFill;

    public Owal(boolean isFill) {
        this.isFill = isFill;
        System.out.println("Creating a Oval witf till = "+isFill);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {

        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (isFill)
            circle.fillOval(x, y, width, height);

    }
}
