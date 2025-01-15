package core.basesyntax;

public class Square extends Figure {
    public double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("this figure is square: color: " + color + ", length: " + roundToTwoDecimals(side) + ", area: " + roundToTwoDecimals(getArea()) + ".");
    }
}