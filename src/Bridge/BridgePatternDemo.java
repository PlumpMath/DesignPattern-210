package Bridge;

import Bridge.DrawInterface.GreenCircle;
import Bridge.DrawInterface.RedCircle;
import Bridge.Shape.Circle;
import Bridge.Shape.Shape;

/**
 * Created by Yale on 16/8/7.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
