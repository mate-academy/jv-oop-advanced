package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void drow() {
        System.out.println("Figure: circle" + ", area: " + getArea()
                          + " sq.units, radius: " + radius + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
