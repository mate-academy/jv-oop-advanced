package core.basesyntax;

public class Rectangle extends Figure {
    private int longSide;
    private int shortSide;

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
    public void draw() {
        System.out.println(
                new StringBuilder("Figure: rectangle, ")
                        .append("area: ")
                        .append(String.format("%.1f", getArea()))
                        .append(" sq.units, shortSide: ")
                        .append(shortSide)
                        .append(" units, longSide: ")
                        .append(longSide)
                        .append(" units, color: ")
                        .append(getColor().toLowerCase())
        );
    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }
}
