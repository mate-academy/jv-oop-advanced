package core.basesyntax;

public class Square extends Figure {
    private double sideSquare;

    public Square(double side, Color color) {
        super(color);
        this.sideSquare = side;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + sideSquare + " units, color: " + color.name());
    }
}
