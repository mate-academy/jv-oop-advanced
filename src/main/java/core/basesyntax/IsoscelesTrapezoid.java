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

    public IsoscelesTrapezoid() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUpperBasis() {
        return upperBasis;
    }

    public void setUpperBasis(int upperBasis) {
        this.upperBasis = upperBasis;
    }

    public int getLowerBasis() {
        return lowerBasis;
    }

    public void setLowerBasis(int lowerBasis) {
        this.lowerBasis = lowerBasis;
    }

    @Override
    public String draw() {
        return "IsoscelesTrapezoid{" + " color= " + getColor()
                + " height=" + height
                + ", upperBasis=" + upperBasis
                + ", lowerBasis=" + lowerBasis
                + " area="
                + this.getArea()
                + '}';
    }

    @Override
    public double getArea() {
        return (double) (upperBasis + lowerBasis) / 2 * height;
    }
}
