package core.basesyntax;

public class Circle extends Figure implements GetArea {
    private int radius;

    public Circle(int radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public void getDraw() {
        System.out.println("Circle, area: " + getArea() + " square units, radius: " + getRadius()
                + " units, color: " + getColour());
    }
}
