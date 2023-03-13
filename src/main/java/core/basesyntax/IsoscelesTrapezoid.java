package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double diagonal;
    private final double topLeg;
    private final double bottomLeg;

    public IsoscelesTrapezoid(double diagonal, double topLeg, double bottomLeg, String color) {
        this.diagonal = diagonal;
        this.topLeg = topLeg;
        this.bottomLeg = bottomLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return topLeg * topLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %f sq.units, diagonal: %f units, topLeg: %f units,"
                        + " bottomLeg: %f units, color: %s \n",
                name, getArea(), diagonal, topLeg, bottomLeg, color);
    }
}
