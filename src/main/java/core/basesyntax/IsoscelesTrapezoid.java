package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double area() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing figure Isosceles Trapezoid, area "
                + area() + ", color - " + getColor());
    }
}
