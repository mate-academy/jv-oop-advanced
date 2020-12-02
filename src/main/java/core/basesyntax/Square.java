package core.basesyntax;

public class Square extends Figure implements GetArea {
    private int sideLength;

    public Square(int sideLength, Colour colour) {
        super(colour);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (sideLength * sideLength);
    }

    @Override
    public void getDraw() {
        System.out.println("Square, area: " + getArea() + " square units, side length: "
                + sideLength + " units, color: " + getColour());
    }
}
