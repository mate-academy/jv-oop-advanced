package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideOne;
    private final int sideTwo;

    public Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public int getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: square; area: " + getArea() + " square units;"
                + " side one: " + sideOne + " units;"
                + " side two: " + sideTwo + " units; "
                + getColor());
    }
}