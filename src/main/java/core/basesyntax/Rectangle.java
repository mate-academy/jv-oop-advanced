package main.java.core.basesyntax;

public class Rectangle extends Figure {
    private int longSide;
    private int shortSide;

    public Rectangle(String color, int longSide, int shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, long side: "
                + longSide + " units, " + "short side: " + shortSide
                + " units, color: " + getColor();
    }
}
