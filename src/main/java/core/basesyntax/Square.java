package core.basesyntax;

public class Square extends Figure {
    private double sideOfSquare;

    public Square(double sideOfSquare) {
        ;
        this.sideOfSquare = sideOfSquare;
    }

    public Square(double sideOfSquare, String color) {
        super(color);
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double getArea() {
        return sideOfSquare * sideOfSquare;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + sideOfSquare + " units, color: " + getColor();
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + sideOfSquare + " units, color: " + getColor();
    }
}
