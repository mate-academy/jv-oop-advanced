package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        if (side <= 0) {
            this.side = 0;
        } else {
            this.side = side;
        }
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getFigureName() {
        return "square";
    }

    @Override
    public String getDetails() {
        return "side: " + side + " units";
    }
}
