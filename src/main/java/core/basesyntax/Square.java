package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Colour colour) {
        this.colour = colour;
        this.side = side;
        area = side * side;
    }

    public double getDiagonal() {
        return parsingValue(Math.sqrt(2 * side));
    }

    public double getSide() {
        return side;
    }
    public double getPerimeter() {
        return parsingValue(side*4);
    }

    @Override
    public double getArea() {
        return parsingValue(area);
    }

    @Override
    public String toString() {
        return "Square:" +
                " colour: " + colour +
                ", area: " +  + getArea() + " units" +
                ", side: " + side + " units" +
                ", diagonal: " + this.getDiagonal() + " units" +
                ", perimeter: " + this.getPerimeter() + " units";

    }
}
