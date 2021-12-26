package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + formatDouble(area(),1) + " sq.units, "
                + "side: " + formatDouble(side) + " units, color: " + getColor();
    }
}
