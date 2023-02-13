package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final TypeOfFigure type = TypeOfFigure.RECTANGLE;

    public Rectangle(Color color, TypeOfFigure typeOfFigure, int firstSide, int secondSide) {
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
        return firstSide * secondSide;
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
