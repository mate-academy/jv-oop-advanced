package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: circle, color: " + super.getColor() + ", radios size: "
                + radius + ", area: " + calculateArea());
    }

    @Override
    public void draw() {

    }
}
