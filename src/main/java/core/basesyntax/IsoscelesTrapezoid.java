package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final Round round = new Round();
    private int topSide;
    private int bottomSide;
    private int trapezoidHeight;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int trapezoidHeight) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.trapezoidHeight = trapezoidHeight;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(int trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getArea() {
        return round.toRound(((double) (topSide + bottomSide) / 2) * trapezoidHeight);
    }

    public void toDraw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top side: " + getTopSide() + " units, bottom side: "
                + getBottomSide() + ", trapezoid height: "
                + getTrapezoidHeight() + ", color: " + getColor());
    }
}
