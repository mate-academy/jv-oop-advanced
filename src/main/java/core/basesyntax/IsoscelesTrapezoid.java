package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double shorterBase;
    private double longerBase;
    private double height;

    public IsoscelesTrapezoid(double shorterBase, double longerBase, double height, MyColor color) {
        super(color.name());
        this.shorterBase = shorterBase;
        this.longerBase = longerBase;
        this.height = height;
    }

    public double getShorterBase() {
        return shorterBase;
    }

    public void setShorterBase(double shorterBase) {
        this.shorterBase = shorterBase;
    }

    public double getLongerBase() {
        return longerBase;
    }

    public void setLongerBase(double longerBase) {
        this.longerBase = longerBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (shorterBase + longerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, Shorter Base: " + shorterBase
                + " units, Longer Base: " + longerBase + " units, Height: " + height
                + " units, color: " + getColor());
    }
}
