package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    protected Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    protected int getRadius() {
        return radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Circle has drawn!");
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString()
                + "radius: " + radius + " units.";
    }
}
