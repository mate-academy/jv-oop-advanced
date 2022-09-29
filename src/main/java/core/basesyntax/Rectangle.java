package core.basesyntax;

public class Rectangle extends Figure {
    private final int side;
    private final int secondSide;

    public Rectangle(Colors color, int side, int secondSide) {
        super(color);
        this.side = side;
        this.secondSide = secondSide;
    }

    @Override
    public float getArea() {
        return side * secondSide;
    }

    @Override
    public String printInfo() {
        return "Figure: " + Rectangle.class.getSimpleName()
                + ", area: " + getArea() + " units, side: "
                + side + " units, second side: " + secondSide
                + ", color: " + getColor().name().toLowerCase();

    }
}
