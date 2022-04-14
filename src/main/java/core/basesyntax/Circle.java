package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        setSquare(Math.PI * radius * radius);
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
