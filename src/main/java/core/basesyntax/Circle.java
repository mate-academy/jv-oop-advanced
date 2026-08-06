package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double obtaining() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle, area: " + obtaining()
                + " sq. units,  radius: " + radius
                + " units, color: " + getColor());
    }
}
