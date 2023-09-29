package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: circle, area: " + findArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor()));
    }
}
