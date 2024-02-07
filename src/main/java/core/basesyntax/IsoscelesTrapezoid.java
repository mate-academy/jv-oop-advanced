package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide,
                              int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units second side: " + secondSide
                + " units, height isosceles trapezoid: " + height
                + " units, color: " + getColor());
    }
}
