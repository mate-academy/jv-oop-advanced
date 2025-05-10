package core.basesyntax;

public class Square extends Figure {
    private final int sideOfSquare;

    public Square(String color, int sideOfSquare) {
        super(color);
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double getArea() {
        return sideOfSquare * sideOfSquare;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: "
                        + getArea()
                        + " sq.units, side: "
                        + sideOfSquare
                        + " units, color: "
                        + getColor()
        );
    }
}
