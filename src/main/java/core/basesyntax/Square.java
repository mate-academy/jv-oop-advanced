package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public String drawTheFigure() {
        return "Figure: square, area: "
                + calculateArea() + " sq.units, side: " + side + " units, color: " + color.toLowerCase();
    }
}
