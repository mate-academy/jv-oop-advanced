package core.basesyntax;

public class Square extends Figure {
    private double squareSide;

    public Square(String color, double squareSide) {
        super(color);
        this.squareSide = squareSide;
    }

    @Override
    public void draw() {
        System.out.println("This " + getColor() + " square has side "
                + squareSide + " and area " + getArea());
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }
}
