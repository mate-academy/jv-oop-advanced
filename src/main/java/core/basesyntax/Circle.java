package core.basesyntax;

public class Circle extends Figure implements AreaDrawable {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: circle, radius = " + radius
                    + ", area = " + getArea() + ", color: " + getRandomColor());

    }
}
