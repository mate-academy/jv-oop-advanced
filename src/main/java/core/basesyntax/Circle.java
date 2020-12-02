package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
        calculateArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius
                + ", color: " + getColor());
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * (getRadius() * getRadius()));
    }

    public int getRadius() {
        return radius;
    }
}
