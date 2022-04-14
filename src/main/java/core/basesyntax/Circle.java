package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: circle\narea: " + getSquare() + " sq.units\nradius: "
                + radius + " units\ncolor: " + getColor());
    }
}
