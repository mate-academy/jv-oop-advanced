package core.basesyntax;

public class Rectangle extends Figure implements IAreaCalculator {
    private double shortSide;
    private double longSide;

    public Rectangle(String name, String color, double shortSide, double longSide) {
        super(name, color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + getArea() + " sq.units, "
                + "shortSide: " + shortSide + " units, "
                + "longSide: " + longSide + " units, "
                + "color: " + getColor() + ".");
    }
}
