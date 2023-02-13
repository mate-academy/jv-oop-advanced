package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final TypeOfFigure type = TypeOfFigure.TRIANGLE;

    public RightTriangle(Color color, int firstSide, int secondSide) {
        super(color, TypeOfFigure.CIRCLE);
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
    public double calculateArea() {
        return (firstSide * secondSide) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType().name()
                + ", area: " + calculateArea()
                + " sq.units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " units, color: " + getColor());
    }
}
