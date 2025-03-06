package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + calculate() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }

    @Override
    public double calculate() {
        return Math.PI * Math.pow(radius, 2);
    }
}
