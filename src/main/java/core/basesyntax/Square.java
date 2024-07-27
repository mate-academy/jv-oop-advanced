package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color, FigureType.SQUARE.name());
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getFigureData() {
        return "side: " + side + " units";
    }
}
