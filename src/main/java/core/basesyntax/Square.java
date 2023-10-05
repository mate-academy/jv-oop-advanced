package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square of square = " + side * side);
    }

    @Override
    String getInfo() {
        return "Figure: Square, area: " + side
                + " sq.units, " + "side " + side + " units, " + "color: " + getColor();
    }
}
