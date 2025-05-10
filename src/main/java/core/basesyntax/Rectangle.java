package core.basesyntax;

public class Rectangle extends Figure {
    private int shortSide;
    private int longSide;

    public Rectangle(String color, int shortSide, int longSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    public void drawInfo() {
        System.out.print("Figure: rectangle, area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, shortSide: " + shortSide
                + " units, longSide: " + longSide + " units, color: " + getColor());
    }
}
