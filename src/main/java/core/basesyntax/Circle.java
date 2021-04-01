package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow((this.radius), 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %1.1f sq. units, radius: %d units, color: %s \n",
                getName(), getArea(), this.radius, getColor());
    }
}
