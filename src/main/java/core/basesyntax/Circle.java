package core.basesyntax;

public class Circle implements Figura {
    private final double radius;
    private final String color;

    public Circle(double radius,String color) {
        this.color = color;
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Figure : circle, "
                + "area: " + getArea()
                + " sq. units, radius: "
                + this.radius + " units, color: '"
                + this.color + "'";
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
