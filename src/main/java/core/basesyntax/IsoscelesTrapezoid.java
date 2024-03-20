package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBasis;
    private int bottomBasis;
    private int height;

    public IsoscelesTrapezoid(String color, int topBasis, int bottomBasis, int height) {
        super(color);
        this.topBasis = topBasis;
        this.bottomBasis = bottomBasis;
        this.height = height;
    }

    public int getTopBasis() {
        return topBasis;
    }

    public int getBottomBasis() {
        return bottomBasis;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return Math.round(0.5 * (topBasis + bottomBasis) * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq. units, top basis: "
                + topBasis + " units, bottom basis: "
                + bottomBasis + " units, height: "
                + height + " units, color: " + getColor().toLowerCase()
        );
    }
}
