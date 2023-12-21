package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure " + this.getClass().getSimpleName() + "\n"
                + "Color " + color + "\n"
                + "Area " + getArea() + "\n"
                + "Radius " + radius);
    }
}
