package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String display() {
        return "Figure: square, area " + String.format("%.2f", calculateArea())
                + " sq. units, side " + side + " units, color: " + getColor();
    }
}
