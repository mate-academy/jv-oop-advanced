package core.basesyntax;

public class Circle extends Figure {

    public Circle(String color, double radius) {
        super(color, radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getSide(), 2);
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, radius: %.1f units, color: %s\n",
                "circle", getArea(), getSide(), getColor());
    }
}
