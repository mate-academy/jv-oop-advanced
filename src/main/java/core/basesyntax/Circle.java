package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Circle: "
                + "radius = " + radius
                + ", color = " + getColor()
                + ", area = " + areaCalculator() + '.');
    }

    @Override
    public double areaCalculator() {
        return Math.PI * (radius * radius);
    }
}
