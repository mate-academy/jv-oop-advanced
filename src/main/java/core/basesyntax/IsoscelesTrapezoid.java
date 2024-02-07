package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBasis;
    private int bottomBasis;
    private int lateralSide;

    public IsoscelesTrapezoid(String name, String color, int topBasis, int bottomBasis,
                              int lateralSide) {
        super(name, color);
        this.topBasis = topBasis;
        this.bottomBasis = bottomBasis;
        this.lateralSide = lateralSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + String.format("%.1f",getArea())
                + " sq.units, topBasis: " + topBasis
                + " units, bottomBasis: " + bottomBasis + " units, lateralSide: "
                + lateralSide + " units, color: " + getColor());
    }

    @Override
    public Double getArea() {
        return ((topBasis + bottomBasis) / 4) * Math.sqrt((4 * Math.pow(lateralSide, 2))
                - Math.pow(topBasis - bottomBasis, 2));
    }
}
