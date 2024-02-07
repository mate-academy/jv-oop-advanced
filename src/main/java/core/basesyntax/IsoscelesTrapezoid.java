package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int heightIsoscelesTrapezoid;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide,
                              int heightIsoscelesTrapezoid) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.heightIsoscelesTrapezoid = heightIsoscelesTrapezoid;
    }

    @Override
    public double getArea() {
        return (double) (firstSide + secondSide) / 2 * heightIsoscelesTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units second side: " + secondSide
                + " units, height isosceles trapezoid: " + heightIsoscelesTrapezoid
                + " units, color: " + getColor());
    }
}
