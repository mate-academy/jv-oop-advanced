package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public void toDraw() {
        System.out.println("Type = Circle, radius = "
                + radius + ", area = "
                + getArea() + ", color = " + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
