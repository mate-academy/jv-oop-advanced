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

    @Override
    public double getArea() {
        return 0.5 * (topBasis + bottomBasis) * height;
    }

    @Override
    public void draw() {
        String result = "Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq. units, top basis: "
                + topBasis + " units, bottom basis: "
                + bottomBasis + " units, height: "
                + height + " units, color: " + getColor().toLowerCase() + System.lineSeparator();
        System.out.printf(result);
    }
}
