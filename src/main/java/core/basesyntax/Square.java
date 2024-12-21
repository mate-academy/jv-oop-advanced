package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String printInformation() {
        return "Figure: Square, area: " + getArea()
                + "sq. units, side: " + side + " units, color: " + getColor();
    }
}
