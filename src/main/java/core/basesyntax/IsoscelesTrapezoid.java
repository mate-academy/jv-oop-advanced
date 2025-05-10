package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int shorterBase;
    private int longerBase;

    public IsoscelesTrapezoid(String color, int leg, int shorterBase, int longerBase) {
        super(color);
        this.leg = leg;
        this.shorterBase = shorterBase;
        this.longerBase = longerBase;
    }

    @Override
    public double getArea() {
        return (shorterBase + longerBase) / 2
                * Math.sqrt(Math.pow(leg, 2) - Math.pow((longerBase - shorterBase), 2) / 4);
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq.units, leg: "
                + leg
                + " units, shorter base: "
                + shorterBase
                + " units, longer base: "
                + longerBase
                + " units, color: "
                + getColor();
    }
}
