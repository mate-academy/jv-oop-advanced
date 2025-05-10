package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.RECTANGLE
                + ", area :" + calculateArea()
                + " sq.units, firstSide:" + firstSide
                + ", secondSide :" + secondSide
                + ", color:" + getColor());

    }
}
