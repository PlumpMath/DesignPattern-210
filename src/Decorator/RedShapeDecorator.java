package Decorator;

/**
 * Created by Yale on 16/8/11.
 */
public class RedShapeDecorator extends ShapeDecorator implements Shape{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}