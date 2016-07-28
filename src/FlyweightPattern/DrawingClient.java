package FlyweightPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class DrawingClient extends JFrame {

    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeFactory.ShapeType shapes[] = {ShapeFactory.ShapeType.LINE, ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOTFILL};
    private static final Color colors[] = {Color.RED, Color.GREEN, Color.YELLOW};

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        JButton startButton = new JButton("Draw");
        Container container = getContentPane();
        final JPanel panel = new JPanel();
        container.add(panel, BorderLayout.CENTER);
        container.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Graphics g = panel.getGraphics();
                        for (int i = 0; i < 20; ++i) {
                                Shape shape = ShapeFactory.getShape(getRandomShape());
                        shape.draw(g,getRandomX(),getRandomY(),getRandomWidth(),getRandomHeight(),getRandomColor());
                        }


                    }
                }
        );

    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
     }
    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        DrawingClient drawing = new DrawingClient(500,600);

        for (int i = 0; i < 20; i++) {
            System.out.println(Math.random() * 20);
        }
    }

}
