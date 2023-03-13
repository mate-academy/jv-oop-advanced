package core.basesyntax;

public class Rectangle extends Figure {
    private int shorSide;
    private int longSide;

    public Rectangle(String color, int shorSide, int longSide) {
        super(color);
        this.shorSide = shorSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return shorSide * longSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + " area: " + getArea() + "sq.units,"
                + " width: " + shorSide + " units,"
                + " height: " + longSide + " unit,"
                + " color: " + getColor());
    }
}

