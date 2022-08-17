package core.basesyntax;

public class Rectangle extends Figure {
    private final int longSide;
    private final int shortSide;

    public Rectangle(String color, int longSide, int shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    @Override
    public double area() {
        return longSide * shortSide;
    }

    @Override
    public StringBuilder getSizes() {
        return super.getSizes()
                .append("shortSide: ")
                .append(shortSide)
                .append(" units, longSide: ")
                .append(longSide)
                .append(" units");
    }
}
