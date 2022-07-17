package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius, String figureColor) {
        super(figureColor);
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public void drawInfo() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + ", color: " + getFigureColor());
    }
}
