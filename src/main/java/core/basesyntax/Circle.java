package core.basesyntax;

public class Circle extends Figure implements  AreaCalculator, Drawable {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "circle" + ", area: " + getArea()
                + ", radius: " + getRadius() + ", color: " + getColor());
    }
}
