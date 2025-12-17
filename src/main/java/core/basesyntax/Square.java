package core.basesyntax;

public class Square extends Figure {
    protected double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getParameters() {
        return "side: " + String.format("%.2f", side) + " units";
    }
}
