package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final TypeOfFigure type = TypeOfFigure.TRIANGLE;

    public RightTriangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public TypeOfFigure getType() {
        return type;
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType().name()
                + ", area: " + getArea()
                + " sq.units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " units, color: " + getColor());
    }
}
