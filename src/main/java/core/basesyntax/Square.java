package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(int sideLength, String color) {
        this.sideLength = sideLength;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea()
                        + "sq.units, side " + sideLength
                        + " units, color: " + super.getColor()
        );
    }
}
