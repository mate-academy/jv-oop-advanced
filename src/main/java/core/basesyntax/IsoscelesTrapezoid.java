package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shortSide;
    private int longSide;
    private int height;

    public IsoscelesTrapezoid(String color, int shortSide, int longSide, int height) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + areaCalculator()
                + " sq.units, short side: " + this.shortSide
                + " units, long side: " + this.longSide
                + " units, height: " + this.height
                + " units, color: " + this.getColor();
    }

    @Override
    public int areaCalculator() {
        return (this.shortSide + this.longSide) / 2 * this.height;
    }
}
