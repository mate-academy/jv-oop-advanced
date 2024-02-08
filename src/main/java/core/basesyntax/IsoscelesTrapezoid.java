package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int downSide;
    private final int lateraSide;

    public IsoscelesTrapezoid(String color, int topSide, int downSide, int lateraSide) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.lateraSide = lateraSide;
    }

    @Override
    public double calculateArea() {
        return (topSide + downSide) / 2 * Math.sqrt(lateraSide * lateraSide
                - (topSide - downSide) * (topSide - downSide) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, topSide: " + topSide + ", downSide: " + downSide
                + ", lateraSide: " + lateraSide + " units, color: " + getColor());
    }
}
