package FlyweightPattern;

import java.util.HashMap;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class ShapeFactory {

    public static final HashMap<ShapeType, Shape> shapes = new HashMap<>();


    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Owal(true);
            } else if (type.equals(ShapeType.OVAL_NOTFILL))
                shapeImpl = new Owal(false);
            else if (type.equals(ShapeType.LINE))
                shapeImpl = new Line();

        }
        shapes.put(type,shapeImpl);

        return shapeImpl;

    }


    public static enum ShapeType {
        OVAL_FILL, OVAL_NOTFILL, LINE;
    }

}


