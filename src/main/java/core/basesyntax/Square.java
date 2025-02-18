package core.basesyntax;

public class Square extends Figure {
    int side;
    @Override
    public void toDraw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + "sq. units, side: "
                + side
                + "units, color: "
                + color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
