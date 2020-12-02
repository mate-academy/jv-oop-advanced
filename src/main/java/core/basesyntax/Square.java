package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Colour colour) {
        super(colour);
        this.side = side;
    }

    public double getDiagonal() {
        return Math.sqrt(2 * side);
    }

    public double getSide() {
        return side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Square:" +
                " colour: " + getColour() +
                ", area: " + parsingValue(getArea()) + " units" +
                ", side: " + parsingValue(side) + " units" +
                ", diagonal: " + parsingValue(getDiagonal()) + " units" +
                ", perimeter: " + parsingValue(getPerimeter()) + " units";
    }
}
