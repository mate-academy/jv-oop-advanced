package core.basesyntax.figures;

public class Triangle extends Figure {
    private int radius;

    public Triangle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + Triangle.class.getSimpleName()
                + ", with color " + getColor()
                + ", and " + getArea() + " radius");
    }

    @Override
    public double getArea() {
        return radius * radius;
    }
}
