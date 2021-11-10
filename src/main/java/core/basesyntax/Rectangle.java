package core.basesyntax;

public class Rectangle extends Figure {
    private int longSide;
    private int shortSide;

    public Rectangle(int longSide, int shortSide, String color) {
        super("Rectangle", color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public Rectangle() {

    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + " area: " + getArea() + " sq.units, "
                 + "short side: " + shortSide + " units, "
                 + "long side: " + longSide + " units, color: " + super.getColor());
    }
}
