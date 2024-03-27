package core.basesyntax;

public class Circle extends Figure implements AreaCalculate, Drawable{
    private int radius;

    public Circle (int radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, radius: " + radius + ", area: " + getArea()
        + ", color: " + getColor());

    }
}
