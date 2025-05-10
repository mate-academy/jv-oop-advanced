package core.basesyntax.figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getPrint() {
        return "Figure: square, area: " + calculateArea() + "sq. units, " + " side: "
                + side + " units, " + "color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
