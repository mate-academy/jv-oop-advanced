package core.basesyntax;

public class Square extends Figure {
    private int sideOfSquare;

    public Square(int sideOfSquare, String color) {
        super(color);
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double getArea() {
        return Math.round(sideOfSquare * sideOfSquare);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side length: "
                + sideOfSquare + " units, color: " + getColor());
    }
}
