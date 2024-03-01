package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private final double radius;

    public Circle(double radius,String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius * radius * PI;

    }

    @Override
    public String toString() {
        return "Figure: circle, area: "
                + getArea() + " sq. units, radius : "
                + radius + " units, color : "
                + getColor();
    }

}
