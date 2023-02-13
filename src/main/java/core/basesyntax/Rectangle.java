package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + FigureName.RECTANGLE.name()
                + ", area:" + getArea()
                + ", sq.units, first side:" + firstSide
                + ", units, second side: " + secondSide
                + ", units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
