package core.basesyntax.figures;

public class Trapezoid extends Figure {
    private int radius;

    public Trapezoid(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName()
                + ", with color " + getColor()
                + ", and " + getArea() + " radius");
    }

    @Override
    public double getArea() {
        return radius * radius;
    }
}
