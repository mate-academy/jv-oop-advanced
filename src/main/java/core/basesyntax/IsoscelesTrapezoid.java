package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double shortBase;
    private double longBase;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getShortBase() {
        return shortBase;
    }

    public void setShortBase(double shortBase) {
        this.shortBase = shortBase;
    }

    public double getLongBase() {
        return longBase;
    }

    public void setLongBase(double longBase) {
        this.longBase = longBase;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * (shortBase + longBase);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", calculateArea()) + " sq. units, short base: "
                + String.format("%.1f", shortBase) + " units, long base: "
                + String.format("%.1f", longBase) + " units, height: "
                + String.format("%.1f", height)
                + " units, color: " + getColor().toLowerCase());
    }
}
