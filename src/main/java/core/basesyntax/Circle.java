package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.cm., units, color: " + getColor());
    }
}

