package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final TypeFigure name = TypeFigure.RECTANGLE;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public TypeFigure getName() {
        return name;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name() + " area: " + calculateArea()
                + " sq.units, firstSide: " + getFirstSide() + " secondSide: "
                + getSecondSide() + " units, color: " + getColor());
    }
}
