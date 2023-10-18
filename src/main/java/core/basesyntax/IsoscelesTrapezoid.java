package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lateralSide;
    private int bottomBase;
    private int upperBase;

    public IsoscelesTrapezoid(String color, int lateralSide, int bottomBase, int upperBase) {
        super(color);
        this.lateralSide = lateralSide;
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, lateral side: " + lateralSide
                + " units, bottom base: " + bottomBase
                + " units, upper base: " + upperBase
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (upperBase + bottomBase) * 0.5
                * Math.sqrt(Math.pow(lateralSide, 2)
                - Math.pow(upperBase - bottomBase, 2) / 4);
    }
}
