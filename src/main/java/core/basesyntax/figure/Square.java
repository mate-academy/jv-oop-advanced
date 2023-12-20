package core.basesyntax.figure;

public class Square extends Figure {
    double side;

    public Square (double side) {
        this.side = side;
        this.figureName = FigureName.Square;
    }
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + figureName + ", "
                + "area: " + getArea() + " sq. units, "
                + "side: " + side
                + ", color: " + color;

    }
}
