package core.basesyntax;

public class Rectangle extends Figure {
    private final int oneSide;
    private final int anotherSide;

    public Rectangle(Color color, int oneSide, int anotherSide) {
        super(color);
        this.oneSide = oneSide;
        this.anotherSide = anotherSide;
    }

    @Override
    public double getArea() {
        return oneSide * anotherSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, oneSide: "
                + oneSide + " units, anotherSide: " + anotherSide + " units, color: " + color
                + ".");
    }
}
