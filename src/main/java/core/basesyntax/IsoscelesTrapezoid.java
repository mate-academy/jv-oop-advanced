package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int trapezoidHeight;

    public IsoscelesTrapezoid(Color color, int lowerBase, int upperBase, int trapezoidHeight) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.trapezoidHeight = trapezoidHeight;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) / 2 * trapezoidHeight;
    }

    @Override
    public void draw() {
        System.out.println("THIS IS RIGHT ISOSCELES TRAPEZOID");
    }

    @Override
    public String displayInformation() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq. units, upper base length: " + upperBase
                + " units, lower base length: " + lowerBase + " units, trapezoid height: "
                + "units, color: " + getColor();
    }
}
