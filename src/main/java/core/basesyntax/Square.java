package core.basesyntax;

public class Square extends Figure implements HasDiagonal {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;

    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public String getFigureInformation() {
        return String.format("Shape: square, area: %.2f sq. units, side length: %s units, diagonal:"
                + " %.3f units, color: %s", getArea(), side, getDiagonal(), getColor());
    }

    @Override
    public void draw() {
        System.out.println(" You draw " + getColor() + " square!");
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(2) * side;
    }
}
