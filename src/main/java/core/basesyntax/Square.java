package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.ceil(side * side * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: square"
                + ", area: " + calculateArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor());
    }

}
