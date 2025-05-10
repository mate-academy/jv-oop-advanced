package core.basesyntax;

public class Square extends Figure {
    private double squareSide;

    public Square(Color color, double squareSide) {
        super(color);
        this.squareSide = squareSide;
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square");
        System.out.println("Area: " + getArea() + " sq. units");
        System.out.println("Side: " + squareSide + " units");
        System.out.println("Color: " + getColor());
        System.out.println(" ");
    }
}
