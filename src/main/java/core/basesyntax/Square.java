package core.basesyntax;

public class Square extends Figure {
    private final int sideSquare;

    public Square(String color, int sideSquare) {
        super(color);
        this.sideSquare = sideSquare;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq.units, sideSquare: " + sideSquare
                + " units, color: " + getColor());
    }
}
