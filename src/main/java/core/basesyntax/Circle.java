package core.basesyntax;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: circle, area: %.2f sq.units, radius: %.2f units, color: %s \n",
                getArea(), radius, getColor());
    }
}
