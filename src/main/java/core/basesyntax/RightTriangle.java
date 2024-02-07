package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public RightTriangle(Color color, TypeOfFigure typeOfFigure, int firstSide, int secondSide) {
        super(color, typeOfFigure);
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
        return getTypeOfFigure();
    }

    @Override
    public double calculateArea() {
        return (firstSide * secondSide) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType()
                + ", area: " + calculateArea()
                + " sq.units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " units, color: " + getColor());
    }
}
