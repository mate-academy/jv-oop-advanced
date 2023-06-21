package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double shorterBase;
    private double longerBase;
    private double leg;
    private double height;

    public IsoscelesTrapezoid(Color color, double shorterBase, double longerBase, double leg) {
        super(color);
        this.shorterBase = shorterBase;
        this.longerBase = longerBase;
        this.leg = leg;
        this.height = Math.abs(Math.sqrt(Math.pow(leg,2))
                - (Math.pow((longerBase - shorterBase) / 2,2)));
    }

    @Override
    public double area() {
        return ((shorterBase + longerBase) * height / 2);
    }

    @Override
    public String info() {
        return "Figure: isoscelesTrapezoid, area: " + area() + " sq.units, shorterBase: "
                + shorterBase + " units, longerBase: " + longerBase + " units, leg: "
                + leg + " units, color: " + getColor().name().toLowerCase();
    }
}
