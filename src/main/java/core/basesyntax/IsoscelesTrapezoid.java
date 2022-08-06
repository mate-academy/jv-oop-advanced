package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double longBase;
    private double shortBase;
    private double high;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public double getLongBase() {
        return longBase;
    }

    public void setLongBase(double longBase) {
        this.longBase = longBase;
    }

    public double getShortBase() {
        return shortBase;
    }

    public void setShortBase(double shortBase) {
        this.shortBase = shortBase;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        return (longBase + shortBase) / 2 * high;
    }

    @Override
    public String getInfo() {
        return "Figure: " + getFigureName() + ", "
                + "area: " + getArea() + " sq.units, longBase: " + getLongBase()
                + ", shortBase: " + getShortBase() + ", high: " + getHigh()
                + ", color: " + getColor();
    }

    public IsoscelesTrapezoid setRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFigureName("isosceles trapezoid");
        isoscelesTrapezoid.setLongBase(random.nextDouble() + 1);
        isoscelesTrapezoid.setShortBase(random.nextDouble() + 1);
        isoscelesTrapezoid.setHigh(random.nextDouble() + 1);
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }
}
