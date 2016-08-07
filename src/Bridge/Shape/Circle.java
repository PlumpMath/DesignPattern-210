package Bridge.Shape;

import Bridge.DrawInterface.DrawAPI;

/**
 * Created by Yale on 16/8/7.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

//
//
//    public Circle(DrawAPI drawAPI) {
//        super(drawAPI);
//    }
//
//    @Override
//    public void draw() {
//
//    }
}
