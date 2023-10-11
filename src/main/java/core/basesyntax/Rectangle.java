package core.basesyntax;

public class Rectangle extends Figure {
    private int shortSide;
    private int longSide;

    public Rectangle(String color, int shortSide, int longSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
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

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + areaCalculator()
                + " sq.units, short side: " + this.shortSide
                + " units, long side: " + this.longSide
                + " units, color: " + this.getColor();
    }

    @Override
    public int areaCalculator() {
        return this.shortSide * this.longSide;
    }
}
