package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private double height;
    private double base;

    public IsoscelesTrapezoid(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * height * base;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid - Are: " + getArea()
                + ", height: " + height + ", base: " + base + ", color: " + color);
    }
}
