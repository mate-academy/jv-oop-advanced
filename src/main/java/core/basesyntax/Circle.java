package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String figure, String color, double radius) {
        super(figure, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure : " + getFigure() + ", color : " + getColor()
                + ", radius : " + radius + " units, area : " + getArea() + " sq.units");
    }
}
