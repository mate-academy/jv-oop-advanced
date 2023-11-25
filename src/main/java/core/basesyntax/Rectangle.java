package core.basesyntax;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public Rectangle(Color color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double findArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: rectangle, area: " + findArea()
                + " sq.units, side 1: " + sideOne + " sq.units, side 2: "
                + sideTwo + "units, color: " + getColor()));
    }
}
