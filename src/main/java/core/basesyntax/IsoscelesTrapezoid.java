package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBasis;
    private int secondBasis;

    public IsoscelesTrapezoid(String color, int height, int firstBasis, int secondBasis) {
        super(color);
        this.height = height;
        this.firstBasis = firstBasis;
        this.secondBasis = secondBasis;
    }

    public int getHeight() {
        return height;
    }

    public int getFirstBasis() {
        return firstBasis;
    }

    public int getSecondBasis() {
        return secondBasis;
    }

    @Override
    public double getArea() {
        return (firstBasis + secondBasis) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid,"
                + " area: " + getArea()
                + " sq. units, height: " + height
                + " units, firstBasis: " + firstBasis
                + " units, secondBasis: " + secondBasis
                + " units, color: " + getColor();
    }
}
