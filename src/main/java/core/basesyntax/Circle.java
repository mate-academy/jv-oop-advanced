package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String circleInfo = "Figure "
                + this.getClass().getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, radius "
                + radius
                + " units, color: "
                + getColor();
        System.out.println(circleInfo);
    }
}
