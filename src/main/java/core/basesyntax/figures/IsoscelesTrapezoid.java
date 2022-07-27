package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Isoscales trapezoid is drawn. ");
    }

    @Override
    public double getArea() {
        return 0.5 * height * (firstSide + secondSide);
    }
}
