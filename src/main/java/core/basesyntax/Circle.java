package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, radius: " + radius + " units");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
