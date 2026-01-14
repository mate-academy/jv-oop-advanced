package core.basesyntax;

public class Square extends Figure {
    private final double squareSide;

    public Square(double squareSide, Colors color) {
        this.squareSide = squareSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }

    @Override
    public void print() {
        System.out.println(
                "Figure: Square, "
                        + "area: " + getArea() + " sq. units, "
                        + "squareSide: " + squareSide + " units, "
                        + "color: " + getColor().name());
    }
}
