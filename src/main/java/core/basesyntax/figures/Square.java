package core.basesyntax.figures;

public class Square extends Figure {
    private double sideOfSquare;

    public Square(String color, double sideOfSquare) {
        super(color);
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double getArea() {
        return sideOfSquare * sideOfSquare;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s square, side: %.2f, area: %.2f",
                this.color, this.sideOfSquare, this.getArea()));
    }
}
