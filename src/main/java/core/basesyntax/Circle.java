package core.basesyntax;

public class Circle extends Figure{
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Circle: radius = " + radius + ", area = " + getArea() + ", color - " + getColor());
    }
}
