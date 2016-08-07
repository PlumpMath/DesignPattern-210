package Bridge.Shape;

import Bridge.DrawInterface.*;
/**
 * Created by Yale on 16/8/7.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}