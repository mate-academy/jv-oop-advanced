package core.basesyntax;

public class Circle extends Figure implements FigureBehavior {

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
    public void printState() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()  + ", color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }
}
