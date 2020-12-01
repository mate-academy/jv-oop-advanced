package core.basesyntax;

public class Square extends Figure implements HasDiagonal {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void infoAboutFigure() {
        System.out.printf("Shape: square, area: %.2f sq. units, side length: %s units, diagonal:"
                + " %.3f units, color: %s", getArea(), side, getDiagonal(), getColor());
        System.out.println();
    }

    @Override
    public void drawFigure() {
        System.out.println(" You draw " + getColor() + " square!");
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(2) * side;
    }
}
