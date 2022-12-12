package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBasis;
    private int secondBasis;
    private int heigth;

    public IsoscelesTrapezoid(Color color, int firstBasis, int secondBasis, int heigth) {
        super(color);
        this.firstBasis = firstBasis;
        this.secondBasis = secondBasis;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return (firstBasis + secondBasis) / 2 * heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, leg " + heigth + " units, firstBasis: " + firstBasis
                + " units, secondBasis: " + secondBasis + " color: " + getColor());
    }
}
