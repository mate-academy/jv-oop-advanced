package core.basesyntax;

public class IsoscelesTrapezoid extends ColorFigure {
    private double longerBase;
    private double shorterBase;
    private double height;

    public IsoscelesTrapezoid(String color, double longerBase, double shorterBase, double height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    public double getLongerBase() {
        return longerBase;
    }

    public void setLongerBase(double longerBase) {
        this.longerBase = longerBase;
    }

    public double getShorterBase() {
        return shorterBase;
    }

    public void setShorterBase(double shorterBase) {
        this.shorterBase = shorterBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area:  "
                + getArea() + " sq. units, " + "firstLeg: "
                + getLongerBase() + " units, " + "secondLeg: "
                + getShorterBase() + " units, color: " + getColor());

    }

    public double getArea() {
        return (getShorterBase() + getLongerBase()) * getHeight() / 2;
    }
}

