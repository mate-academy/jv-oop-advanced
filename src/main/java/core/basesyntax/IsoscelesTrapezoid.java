package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shorterBase;
    private int longerBase;
    private int height;

    public IsoscelesTrapezoid(int shorterBase, int longerBase, int height, String color) {
        super(color);
        this.shorterBase = shorterBase;
        this.longerBase = longerBase;
        this.height = height;
    }

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
    public double calculateArea() {
        return (shorterBase + longerBase) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.0f sq. units, "
                + "shorterBase: %d units, longerBase: %d, height: %d color: %s \n",
                calculateArea(), shorterBase, longerBase, height, super.getColor());
    }
}
