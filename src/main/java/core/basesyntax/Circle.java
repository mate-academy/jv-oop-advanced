package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(START_MASSAGE + this + ", area: " + this.getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "circle, "
                + "its color: " + color
                + ", with radius: " + radius + " units";
    }
}
