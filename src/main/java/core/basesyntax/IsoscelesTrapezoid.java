package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upperBasis;
    private int lowerBasis;

    public IsoscelesTrapezoid(String color, int height, int upperBasis, int lowerBasis) {
        super(color);
        this.height = height;
        this.upperBasis = upperBasis;
        this.lowerBasis = lowerBasis;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid{" + " color= " + getColor()
                + " height=" + height
                + ", upperBasis=" + upperBasis
                + ", lowerBasis=" + lowerBasis
                + " area="
                + this.getArea()
                + '}');
    }

    @Override
    public double getArea() {
        return (double) (upperBasis + lowerBasis) / 2 * height;
    }
}
