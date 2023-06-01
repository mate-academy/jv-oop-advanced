package core.basesyntax;

public class Rectangle extends Figure {
    private int longSide;
    private int shortSide;

    public Rectangle(String color, int longSide, int shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double findArea() {
        return longSide * shortSide;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: "
                + this.findArea() + " sq.units, longSide: "
                + this.longSide + " units, shortSide: "
                + this.shortSide + " units, color: " + this.getColor());
    }
}
