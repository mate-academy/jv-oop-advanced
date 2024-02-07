package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public String getUniqueProperties() {
        return "side: " + side + " units";
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
