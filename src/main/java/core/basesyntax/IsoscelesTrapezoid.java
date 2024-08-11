package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shorterBase;
    private int longerBase;
    private int height;

    public int getShorterBase() {
        return shorterBase;
    }

    public void setShorterBase(int shorterBase) {
        this.shorterBase = shorterBase;
    }

    public int getLongerBase() {
        return longerBase;
    }

    public void setLongerBase(int longerBase) {
        this.longerBase = longerBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return (double) ((getLongerBase() + getShorterBase()) * getHeight()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + obtainArea() + " sq. units, shorten base: "
                + getShorterBase() + " units, longer base: "
                + getLongerBase() + " units, height: "
                + getHeight() + " units, color:"
                + getColor());
    }
}
