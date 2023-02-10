package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final FigureType figureType = FigureType.RECTANGLE;

    public Rectangle(String color, int firstSide, int secondSide) {
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

    public FigureType getFigureType() {
        return figureType;
    }

    @Override
    public int getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, firstSide: " + getFirstSide()
                + " units, secondSide: " + getSecondSide()
                + " units, color: " + getColor());
    }
}
