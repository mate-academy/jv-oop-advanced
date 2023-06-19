package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int bottomBase;
    private int upperBase;

    public IsoscelesTrapezoid(Color color, int leg, int bottomBase, int upperBase) {
        super(color);
        this.leg = leg;
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(
                    Math.pow(leg, 2) - Math.pow((Math.abs(bottomBase - upperBase) / 2), 2)
                )
                * (bottomBase + upperBase)) / 2;
    }

    @Override
    protected Shape getShape() {
        return Shape.ISOSCELES_TRAPEZOID;
    }

    @Override
    protected String getSizeDescription() {
        return "bottomBase: " + bottomBase + " units, upperBase: "
                + upperBase + " units, leg: " + leg + " units";
    }
}
