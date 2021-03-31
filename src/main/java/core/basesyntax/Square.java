package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units, side length: "
                + side + " units, color: " + getFigureColor();
    }
}
