package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int longerBase;
    private int shorterBase;
    private int height;

    public int getLongerBase() {
        return longerBase;
    }

    public void setLongerBase(int longerBase) {
        this.longerBase = longerBase;
    }

    public int getShorterBase() {
        return shorterBase;
    }

    public void setShorterBase(int shorterBase) {
        this.shorterBase = shorterBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (longerBase + shorterBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq. units, longer base: " + longerBase + " units, shorter base: "
                + shorterBase + " units, height: " + height + " units, color: " + getColor());
    }
}
