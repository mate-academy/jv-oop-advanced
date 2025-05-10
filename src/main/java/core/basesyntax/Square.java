package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + decimalFormat.format(calculateArea()) + " sq. units, side: "
                + decimalFormat.format(side) + " units, color: " + color);
    }
}
